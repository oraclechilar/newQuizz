package uz.jl.repository.test;

import org.bson.types.ObjectId;
import uz.jl.criteria.test.TestCriteria;
import uz.jl.dao.GenericDao;
import uz.jl.entity.test.Test;
import uz.jl.repository.GenericCrudRepository;
import uz.jl.repository.GenericRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Bakhromjon Wed, 9:34 AM 1/26/2022
 */
public class TestRepository extends GenericDao<TestCriteria, Test>
        implements GenericCrudRepository<Test, ObjectId>,
        GenericRepository<Test, TestCriteria, ObjectId> {

    public TestRepository(Class<Test> clazz) {
        super(clazz);
    }

    @Override
    public ObjectId create(Test entity) {
        return null;
    }

    @Override
    public void delete(ObjectId key) {

    }

    @Override
    public void update(Test entity) {

    }

    @Override
    public List<Test> list(TestCriteria criteria) {
        return null;
    }

    @Override
    public Optional<Test> get(ObjectId key) {
        return Optional.empty();
    }
}
