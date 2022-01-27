package uz.jl.repository.test;

import com.mongodb.client.FindIterable;
import com.mongodb.client.model.Filters;
import org.bson.types.ObjectId;
import uz.jl.criteria.test.TestCriteria;
import uz.jl.dao.GenericDao;
import uz.jl.dto.test.WorkingTestDto;
import uz.jl.entity.auth.User;
import uz.jl.entity.test.Test;
import uz.jl.repository.GenericCrudRepository;
import uz.jl.repository.GenericRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Bakhromjon Wed, 9:34 AM 1/26/2022
 */
public class TestRepository extends GenericDao<TestCriteria, Test> implements GenericCrudRepository<Test, ObjectId>, GenericRepository<Test, TestCriteria, ObjectId> {

    public TestRepository(Class<Test> clazz) {
        super(clazz);
    }

    @Override
    public ObjectId create(Test entity) {
        collection.insertOne(entity);
        return entity.getId();
    }

    @Override
    public void delete(ObjectId key) {
        // TODO: 1/26/2022 Javohir aka ko'rib beradilar
    }

    @Override
    public void update(Test entity) {
        // TODO: 1/26/2022 Javohir aka ko'rib beradilar
    }

    @Override
    public List<Test> list() {
        List<Test> tests = new ArrayList<>();
        FindIterable<Test> list = collection.find(Filters.ne("deleted", true));
        list.iterator().forEachRemaining(tests::add);
        return tests;
    }

    @Override
    public Optional<Test> get(ObjectId key) {
        Test test = collection.find(Filters.eq("_id", key)).first();
        assert test != null;
        return Optional.of(test);
    }
    public List<Test> myTest(WorkingTestDto dto) {
        List<Test> list = new ArrayList<>();
        List<Test> result = new ArrayList<>();
        FindIterable<Test> tests = collection.find(Filters.and(Filters.eq("_id", new ObjectId(dto.getSubjectId())),
                Filters.eq("level", dto.getLevel().toUpperCase()),
                Filters.eq("language", dto.getLanguage().toUpperCase())));
        tests.iterator().forEachRemaining(list::add);
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get((int) (Math.random() * 1) + list.size()));
        }
        return result;
    }

}
