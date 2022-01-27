package uz.jl.configs;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import uz.jl.entity.auth.User;
import uz.jl.entity.test.Test;
import uz.jl.mappers.test.TestMapper;
import uz.jl.mappers.user.UserMapper;
import uz.jl.repository.test.TestRepository;
import uz.jl.repository.user.UserRepository;
import uz.jl.services.test.TestService;
import uz.jl.services.user.UserService;
import uz.jl.ui.AuthUI;
import uz.jl.ui.TestUI;
import uz.jl.utils.BaseUtils;
import uz.jl.validator.TestValidator;
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
    private final static UserService userService;
    private final static TestRepository testRepository;
    private final static TestMapper testMapper;
    private final static TestValidator testValidator;
    private final static TestService testService;
    private final static TestUI testUI;

    static {
        baseUtils = new BaseUtils();
        connect();
        userRepository = new UserRepository(User.class);
        userMapper = new UserMapper();
        userValidator = new UserValidator(baseUtils);
        userService = new UserService(userRepository, userMapper, userValidator);
        authUI = new AuthUI(userService);
        testRepository = new TestRepository(Test.class);
        testMapper = new TestMapper();
        testValidator = new TestValidator(baseUtils);
        testService = new TestService(testRepository, testMapper, testValidator);
        testUI = new TestUI(testService);
    }

    public static <T> T getBean(Class<T> clazz) {
        return getBean(clazz.getSimpleName());
    }

    private static <T> T getBean(String beanName) {
        return switch (beanName) {
            case "MongoDatabase" -> (T) db;
            case "BaseUtils" -> (T) baseUtils;
            case "UserRepository" -> (T) userRepository;
            case "UserMapper" -> (T) userMapper;
            case "UserValidator" -> (T) userValidator;
            case "UserService" -> (T) userService;
            case "AuthUI" -> (T) authUI;
            case "TestRepository" -> (T) testRepository;
            case "TestMapper" -> (T) testMapper;
            case "TestValidator" -> (T) testValidator;
            case "TestService" -> (T) testService;
            case "TestUI" -> (T) testUI;
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
