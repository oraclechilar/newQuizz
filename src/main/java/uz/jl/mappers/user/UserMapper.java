package uz.jl.mappers.user;

import uz.jl.dto.auth.UserCreateDto;
import uz.jl.dto.auth.UserDto;
import uz.jl.dto.auth.UserUpdateDto;
import uz.jl.entity.auth.User;
import uz.jl.mappers.GenericMapper;

/**
 * @author Bakhromjon Wed, 3:58 PM 1/26/2022
 */
public class UserMapper implements GenericMapper<User, UserDto, UserCreateDto, UserUpdateDto> {
    @Override
    public User fromDto(UserDto dto) {
        return null;
    }

    @Override
    public User fromCreateDto(UserCreateDto dto) {
        return null;
    }

    @Override
    public User fromUpdateDto(UserUpdateDto dto) {
        return null;
    }

    @Override
    public UserDto toDto(User entity) {
        return null;
    }
}
