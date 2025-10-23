package co.edu.uptc.user.controller;

import co.edu.uptc.user.dto.UserDTO;
import co.edu.uptc.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    public ResponseEntity<UserDTO> saveUser(@RequestBody UserDTO userDTO){
        UserDTO user = userService.saveUser(userDTO);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> getAllUsers(){
        List<UserDTO> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/fetchUserById/{id}")
    public ResponseEntity<UserDTO> fetchUserById(@PathVariable Long id){
        return userService.fetchUserById(id);
    }
}
