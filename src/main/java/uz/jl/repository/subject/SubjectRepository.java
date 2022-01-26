package uz.jl.repository.subject;

import org.bson.types.ObjectId;
import uz.jl.criteria.subject.SubjectCriteria;
import uz.jl.dao.GenericDao;
import uz.jl.entity.subject.Subject;
import uz.jl.repository.GenericCrudRepository;
import uz.jl.repository.GenericRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Bakhromjon Wed, 9:34 AM 1/26/2022
 */
public class SubjectRepository extends GenericDao<SubjectCriteria, Subject>
        implements GenericCrudRepository<Subject, ObjectId>,
        GenericRepository<Subject, SubjectCriteria, ObjectId> {

    public SubjectRepository(Class<Subject> clazz) {
        super(clazz);
    }

    @Override
    public ObjectId create(Subject entity) {
        return null;
    }

    @Override
    public void delete(ObjectId key) {

    }

    @Override
    public void update(Subject entity) {

    }

    @Override
    public List<Subject> list(SubjectCriteria criteria) {
        return null;
    }

    @Override
    public Optional<Subject> get(ObjectId key) {
        return Optional.empty();
    }
}
