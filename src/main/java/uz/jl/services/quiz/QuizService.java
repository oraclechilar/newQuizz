package uz.jl.services.quiz;

import org.bson.types.ObjectId;
import uz.jl.criteria.quiz.QuizCriteria;
import uz.jl.dto.quiz.QuizCreateDto;
import uz.jl.dto.quiz.QuizDto;
import uz.jl.dto.quiz.QuizUpdateDto;
import uz.jl.mappers.quiz.QuizMapper;
import uz.jl.repository.quiz.QuizRepository;
import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;
import uz.jl.services.AbstractService;
import uz.jl.services.GenericCrudService;
import uz.jl.services.GenericService;

import java.util.List;

/**
 * @author Bakhromjon Wed, 10:04 AM 1/26/2022
 */
public class QuizService extends AbstractService<QuizRepository, QuizMapper>
implements GenericCrudService<QuizCreateDto, QuizUpdateDto, ObjectId>, GenericService<QuizDto, QuizCriteria, ObjectId> {
    public QuizService(QuizRepository repository, QuizMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<ObjectId>> create(QuizCreateDto createDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(ObjectId key) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(QuizUpdateDto updateDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<QuizDto>>> list(QuizCriteria criteria) {
        return null;
    }

    @Override
    public ResponseEntity<Data<QuizDto>> get(ObjectId key) {
        return null;
    }
}
