package uz.jl.repository.auth;

import org.bson.types.ObjectId;
import uz.jl.criteria.user.UserCriteria;
import uz.jl.dao.GenericDao;
import uz.jl.dto.auth.UserCreateDto;
import uz.jl.entity.auth.User;
import uz.jl.repository.AbstractRepository;

/**
 * @author Bakhromjon Wed, 5:19 PM 1/26/2022
 */
public class AuthRepository extends GenericDao<UserCriteria, User> {
    public AuthRepository(Class<User> clazz) {
        super(clazz);
    }

    public ObjectId register(UserCreateDto dto) {
        return null;
    }

    public User login(String username, String password) {
        return null;
    }

    public void logout(ObjectId id) {

    }
}
