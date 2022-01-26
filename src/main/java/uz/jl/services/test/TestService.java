package uz.jl.services;

import org.bson.types.ObjectId;
import uz.jl.criteria.TestCriteria;
import uz.jl.dto.test.TestCreateDto;
import uz.jl.dto.test.TestDto;
import uz.jl.dto.test.TestUpdateDto;
import uz.jl.mappers.test.TestMapper;
import uz.jl.repository.TestRepository;
import uz.jl.resonse.Data;
import uz.jl.resonse.ResponseEntity;

import java.util.List;

/**
 * @author Bakhromjon Wed, 10:04 AM 1/26/2022
 */
public class TestService extends AbstractService<TestRepository, TestMapper>
implements GenericCrudService<TestCreateDto, TestUpdateDto, ObjectId>, GenericService<TestDto, TestCriteria, ObjectId>{
    public TestService(TestRepository repository, TestMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<ObjectId>> create(TestCreateDto createDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(ObjectId key) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(TestUpdateDto updateDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<TestDto>>> list(TestCriteria criteria) {
        return null;
    }

    @Override
    public ResponseEntity<Data<TestDto>> get(ObjectId key) {
        return null;
    }
}
