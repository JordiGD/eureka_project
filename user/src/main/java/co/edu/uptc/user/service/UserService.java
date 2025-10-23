package co.edu.uptc.user.service;

import co.edu.uptc.user.dto.UserDTO;
import co.edu.uptc.user.entity.User;
import co.edu.uptc.user.mapper.UserMapper;
import co.edu.uptc.user.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserDTO saveUser(UserDTO userDTO) {
        User user = userRepo.save(UserMapper.INSTANCE.toUser(userDTO));
        return UserMapper.INSTANCE.toUserDTO(user);
    }

    public List<UserDTO> getAllUsers() {
        List<User> users = userRepo.findAll();
        return users.stream().map(UserMapper.INSTANCE::toUserDTO).collect(Collectors.toList());
    }

    public ResponseEntity<UserDTO> fetchUserById(Long id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(
                UserMapper.INSTANCE.toUserDTO(user.get()), HttpStatus.OK);
        }
    }
}
