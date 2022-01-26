package uz.jl.repository.user;

import org.bson.types.ObjectId;
import uz.jl.criteria.user.UserCriteria;
import uz.jl.dao.GenericDao;
import uz.jl.entity.auth.User;
import uz.jl.repository.GenericCrudRepository;
import uz.jl.repository.GenericRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Bakhromjon Wed, 9:34 AM 1/26/2022
 */
public class UserRepository extends GenericDao<UserCriteria, User>
        implements GenericCrudRepository<User, ObjectId>,
        GenericRepository<User, UserCriteria, ObjectId> {

    public UserRepository(Class<User> clazz) {
        super(clazz);
    }

    @Override
    public ObjectId create(User entity) {
        return null;
    }

    @Override
    public void delete(ObjectId key) {

    }

    @Override
    public void update(User entity) {

    }

    @Override
    public List<User> list(UserCriteria criteria) {
        return null;
    }

    @Override
    public Optional<User> get(ObjectId key) {
        return Optional.empty();
    }
}
