package uz.jl.repository.user;

import com.google.gson.Gson;
import com.mongodb.client.FindIterable;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import uz.jl.configs.ApplicationContextHolder;
import uz.jl.criteria.user.UserCriteria;
import uz.jl.dao.GenericDao;
import uz.jl.entity.auth.User;
import uz.jl.repository.GenericCrudRepository;
import uz.jl.repository.GenericRepository;
import uz.jl.security.Session;
import uz.jl.ui.AuthUI;
import uz.jl.ui.Menu;
import uz.jl.utils.Color;
import uz.jl.utils.Print;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * @author Bakhromjon Wed, 9:34 AM 1/26/2022
 */
public class UserRepository extends GenericDao<UserCriteria, User> implements GenericCrudRepository<User, ObjectId>, GenericRepository<User, UserCriteria, ObjectId> {

    public UserRepository(Class<User> clazz) {
        super(clazz);
    }

    AuthUI ui = ApplicationContextHolder.getBean(AuthUI.class);

    @Override
    public ObjectId create(User entity) {
        collection.insertOne(entity);
        return entity.getId();
    }

    public Session login(String username, String password) {
        Bson findibleUserId = new Document("username", username);
        User first = collection.find(findibleUserId).first();
        if (Objects.isNull(first) || !Objects.equals(first.getPassword(), password)) {
            return null;
        }
        return Session.builder().username(first.getUsername()).password(first.getPassword()).language(first.getLanguage().getCode()).role(first.getRole()).build();
    }

    @Override
    public void delete(ObjectId key) {

    }

    @Override
    public void update(User entity) {

    }

    @Override
    public List<User> list() {
        return null;
    }

    @Override
    public Optional<User> get(ObjectId key) {
        return Optional.empty();
    }
}
