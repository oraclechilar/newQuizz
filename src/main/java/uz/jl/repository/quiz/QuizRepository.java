package uz.jl.repository.quiz;

import org.bson.types.ObjectId;
import uz.jl.criteria.quiz.QuizCriteria;
import uz.jl.dao.GenericDao;
import uz.jl.entity.quiz.Quiz;
import uz.jl.repository.GenericCrudRepository;
import uz.jl.repository.GenericRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Bakhromjon Wed, 9:34 AM 1/26/2022
 */
public class QuizRepository extends GenericDao<QuizCriteria, Quiz>
        implements GenericCrudRepository<Quiz, ObjectId>,
        GenericRepository<Quiz, QuizCriteria, ObjectId> {

    public QuizRepository(Class<Quiz> clazz) {
        super(clazz);
    }

    @Override
    public ObjectId create(Quiz entity) {
        return null;
    }

    @Override
    public void delete(ObjectId key) {

    }

    @Override
    public void update(Quiz entity) {

    }

    @Override
    public List<Quiz> list() {
        return null;
    }

    @Override
    public Optional<Quiz> get(ObjectId key) {
        return Optional.empty();
    }
}
