package uz.jl.services.user;

import org.bson.types.ObjectId;
import uz.jl.dto.auth.UserCreateDto;
import uz.jl.dto.auth.UserUpdateDto;
import uz.jl.entity.auth.User;
import uz.jl.mappers.user.UserMapper;
import uz.jl.repository.user.UserRepository;
import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;
import uz.jl.security.SecurityHolder;
import uz.jl.services.AbstractService;
import uz.jl.services.BaseGenericService;
import uz.jl.services.GenericCrudService;
import uz.jl.validator.UserValidator;

import java.util.List;

/**
 * @author Bakhromjon Wed, 10:04 AM 1/26/2022
 */
public class UserService extends AbstractService<UserRepository, UserMapper> implements GenericCrudService<User, UserCreateDto, UserUpdateDto, ObjectId>, BaseGenericService {
    private final UserValidator validator;

    public UserService(UserRepository repository, UserMapper mapper, UserValidator userValidator) {
        super(repository, mapper);
        this.validator = userValidator;
    }


    @Override
    public ResponseEntity<Data<ObjectId>> create(UserCreateDto createDto) {
        try {
//            validator.validOnCreate(createDto);
            User user = mapper.fromCreateDto(createDto);
            return new ResponseEntity<>(new Data<>(repository.create(user)));
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public ResponseEntity<Data<Boolean>> login(String username, String password) {
        try {
            SecurityHolder.setSession(repository.login(username, password));
            return new ResponseEntity<>(new Data<>(true));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(new Data<>(false));
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
    public ResponseEntity<Data<User>> get(ObjectId id) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<User>>> getList() {
        return null;
    }
}
