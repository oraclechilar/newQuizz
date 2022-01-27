package uz.jl.configs;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import uz.jl.entity.auth.User;
import uz.jl.mappers.user.UserMapper;
import uz.jl.repository.user.UserRepository;
import uz.jl.services.user.UserService;
import uz.jl.ui.AuthUI;
import uz.jl.utils.BaseUtils;
import uz.jl.validator.UserValidator;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class ApplicationContextHolder {
    private static MongoDatabase db;
    private final static UserRepository userRepository;
    private final static UserMapper userMapper;
    private final static UserValidator userValidator;
    private final static BaseUtils baseUtils;
    private final static AuthUI authUI;
    private final static UserService userSrvice;

    static {
        baseUtils = new BaseUtils();
        connect();
        userRepository = new UserRepository(User.class);
        userMapper = new UserMapper();
        userValidator = new UserValidator(baseUtils);
        userSrvice = new UserService(userRepository, userMapper, userValidator);
        authUI = new AuthUI(userSrvice);
    }

    public static <T> T getBean(Class<T> clazz) {
        return getBean(clazz.getSimpleName());
    }

    private static <T> T getBean(String beanName) {
        return switch (beanName) {
            case "MongoDatabase" -> (T) db;
            case "UserRepository" -> (T) userRepository;
            case "BaseUtils" -> (T) baseUtils;
            case "UserMapper" -> (T) userMapper;
            case "UserService" -> (T) userSrvice;
            case "UserValidator" -> (T) userValidator;
            case "AuthUI" -> (T) authUI;
            default -> throw new RuntimeException("Bean Not Found");
        };
    }


    private static void connect() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");
        CodecRegistry pojoCodecRegistry = fromProviders(PojoCodecProvider.builder().automatic(true).build());
        CodecRegistry codecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(), pojoCodecRegistry);
        MongoClientSettings clientSettings = MongoClientSettings.builder().applyConnectionString(connectionString).codecRegistry(codecRegistry).build();

        try {
            MongoClient mongoClient = MongoClients.create(clientSettings);
            db = mongoClient.getDatabase("Quiz");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
