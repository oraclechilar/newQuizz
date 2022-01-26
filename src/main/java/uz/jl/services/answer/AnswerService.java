package uz.jl.services;

import org.bson.types.ObjectId;
import uz.jl.criteria.AnswerCriteria;
import uz.jl.dto.answer.AnswerCreateDto;
import uz.jl.dto.answer.AnswerDto;
import uz.jl.dto.answer.AnswerUpdateDto;
import uz.jl.mappers.answer.AnswerMapper;
import uz.jl.repository.AnswerRepository;
import uz.jl.resonse.Data;
import uz.jl.resonse.ResponseEntity;

import java.util.List;

/**
 * @author Bakhromjon Wed, 10:04 AM 1/26/2022
 */
public class AnswerService extends AbstractService<AnswerRepository, AnswerMapper>
implements GenericCrudService<AnswerCreateDto, AnswerUpdateDto, ObjectId>, GenericService<AnswerDto, AnswerCriteria, ObjectId>{
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
    public ResponseEntity<Data<List<AnswerDto>>> list(AnswerCriteria criteria) {
        return null;
    }

    @Override
    public ResponseEntity<Data<AnswerDto>> get(ObjectId key) {
        return null;
    }
}
