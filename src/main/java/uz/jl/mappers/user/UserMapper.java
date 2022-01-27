package uz.jl.mappers.user;

import org.bson.types.ObjectId;
import uz.jl.dto.GenericDto;
import uz.jl.dto.auth.UserCreateDto;
import uz.jl.dto.auth.UserUpdateDto;
import uz.jl.entity.auth.User;
import uz.jl.enums.Language;
import uz.jl.enums.Role;
import uz.jl.enums.Status;
import uz.jl.mappers.GenericMapper;

import java.util.Date;

/**
 * @author Bakhromjon Wed, 3:58 PM 1/26/2022
 */
public class UserMapper implements GenericMapper<User, GenericDto, UserCreateDto, UserUpdateDto> {
    @Override
    public User fromDto(GenericDto dto) {
        return null;
    }

    @Override
    public User fromCreateDto(UserCreateDto dto) {
        return User.child_builder()
                .id(new ObjectId())
                .username(dto.getUsername())
                .password(dto.getPassword())
                .language(Language.getByCode(dto.getLanguage()))
                .role(Role.getByName(dto.getRole()))
                .status(Status.NO_ACTIVE)
                .createdAt(new Date())
                .build();
    }

    @Override
    public User fromUpdateDto(UserUpdateDto dto) {
        return null;
    }

    @Override
    public GenericDto toDto(User model) {
        return null;
    }
}
