package uz.jl.services.test;

import org.bson.types.ObjectId;
import uz.jl.dto.test.TestCreateDto;
import uz.jl.dto.test.TestUpdateDto;
import uz.jl.dto.test.WorkingTestDto;
import uz.jl.entity.test.Test;
import uz.jl.mappers.test.TestMapper;
import uz.jl.repository.test.TestRepository;
import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;
import uz.jl.services.AbstractService;
import uz.jl.services.BaseGenericService;
import uz.jl.services.GenericCrudService;
import uz.jl.validator.TestValidator;
import uz.jl.validator.UserValidator;

import java.util.List;
import java.util.Optional;

/**
 * @author Bakhromjon Wed, 10:04 AM 1/26/2022
 */
public class TestService extends AbstractService<TestRepository, TestMapper> implements GenericCrudService<Test, TestCreateDto, TestUpdateDto, ObjectId>, BaseGenericService {
    private final TestValidator validator;
    public TestService(TestRepository repository, TestMapper mapper, TestValidator validator) {
        super(repository, mapper);
        this.validator = validator;
    }

    @Override
    public ResponseEntity<Data<ObjectId>> create(TestCreateDto createDto) {
        // TODO: 1/26/2022 validOnCreate
        Test test = mapper.fromCreateDto(createDto);
        ObjectId objectId = repository.create(test);
        return new ResponseEntity<>(new Data<>(objectId));
    }

    @Override
    public ResponseEntity<Data<Void>> delete(ObjectId key) {
        repository.delete(key);
        return new ResponseEntity<>(new Data<>());
    }

    @Override
    public ResponseEntity<Data<Void>> update(TestUpdateDto updateDto) {
        // TODO: 1/26/2022 ValidOnUpdate
        Test test = mapper.fromUpdateDto(updateDto);
        repository.update(test);
        return new ResponseEntity<>(new Data<>());
    }

    @Override
    public ResponseEntity<Data<List<Test>>> getList() {
        List<Test> list = repository.list();
        return new ResponseEntity<>(new Data<>(list));
    }

    @Override
    public ResponseEntity<Data<Test>> get(ObjectId key) {
        Optional<Test> optional = repository.get(key);
        // TODO: 1/26/2022 Optionalni almashtirish kerak
        Test test = optional.get();
        return new ResponseEntity<>(new Data<>(test));
    }

    public List<Test> getTest(WorkingTestDto dto) {
        return repository.myTest(dto);
    }
}
