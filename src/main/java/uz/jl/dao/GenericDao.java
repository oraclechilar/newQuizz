package uz.jl.dao;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import uz.jl.configs.ApplicationContextHolder;
import uz.jl.criteria.GenericCriteria;
import uz.jl.entity.Auditable;
import uz.jl.repository.AbstractRepository;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

/**
 * THIS IS A BASE ABSTRACT CLASS THAT PROVIDES CONNECTION WITH MONGO DB
 *
 * @param <C> -> Criteria
 * @param <E> -> Collection
 */
public abstract class GenericDao<C extends GenericCriteria, E extends Auditable> extends AbstractRepository {
    protected MongoDatabase db = ApplicationContextHolder.getBean(MongoDatabase.class );
    protected MongoCollection<E> collection;

    public GenericDao(Class<E> clazz) {
        this.collection = db.getCollection(clazz.getSimpleName(), clazz);
    }
}
