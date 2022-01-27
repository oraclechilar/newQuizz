package uz.jl.services.answer;

import org.bson.types.ObjectId;
import uz.jl.criteria.answer.AnswerCriteria;
import uz.jl.dto.answer.AnswerCreateDto;
import uz.jl.dto.answer.AnswerDto;
import uz.jl.dto.answer.AnswerUpdateDto;
import uz.jl.entity.answer.Answer;
import uz.jl.mappers.answer.AnswerMapper;
import uz.jl.repository.answer.AnswerRepository;
import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;
import uz.jl.services.AbstractService;
import uz.jl.services.BaseGenericService;
import uz.jl.services.GenericCrudService;
import uz.jl.services.GenericService;

import java.util.List;

/**
 * @author Bakhromjon Wed, 10:04 AM 1/26/2022
 */
public class AnswerService extends AbstractService<AnswerRepository, AnswerMapper> implements GenericCrudService<Answer,AnswerCreateDto, AnswerUpdateDto, ObjectId>, BaseGenericService {
    public AnswerService(AnswerRepository repository, AnswerMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<ObjectId>> create(AnswerCreateDto createDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(ObjectId key) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(AnswerUpdateDto updateDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Answer>> get(ObjectId id) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<Answer>>> getList() {
        return null;
    }
}
