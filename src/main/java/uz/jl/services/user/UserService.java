package uz.jl.services.user;

import org.bson.types.ObjectId;
import uz.jl.criteria.user.UserCriteria;
import uz.jl.dto.auth.UserCreateDto;
import uz.jl.dto.auth.UserDto;
import uz.jl.dto.auth.UserUpdateDto;
import uz.jl.mappers.user.UserMapper;
import uz.jl.repository.user.UserRepository;
import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;
import uz.jl.services.AbstractService;
import uz.jl.services.GenericCrudService;
import uz.jl.services.GenericService;

import java.util.List;

/**
 * @author Bakhromjon Wed, 10:04 AM 1/26/2022
 */
public class UserService extends AbstractService<UserRepository, UserMapper>
implements GenericCrudService<UserCreateDto, UserUpdateDto, ObjectId>, GenericService<UserDto, UserCriteria, ObjectId> {
    public UserService(UserRepository repository, UserMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<ObjectId>> create(UserCreateDto createDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(ObjectId key) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(UserUpdateDto updateDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<UserDto>>> list(UserCriteria criteria) {
        return null;
    }

    @Override
    public ResponseEntity<Data<UserDto>> get(ObjectId key) {
        return null;
    }
}
