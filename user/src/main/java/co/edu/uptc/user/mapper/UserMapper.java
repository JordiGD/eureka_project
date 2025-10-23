package co.edu.uptc.user.mapper;

import co.edu.uptc.user.dto.UserDTO;
import co.edu.uptc.user.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO toUserDTO(User user);
    User toUser(UserDTO userDTO);
}
