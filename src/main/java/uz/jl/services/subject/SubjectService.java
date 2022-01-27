package uz.jl.services.subject;

import org.bson.types.ObjectId;
import uz.jl.criteria.subject.SubjectCriteria;
import uz.jl.dto.subject.SubjectCreateDto;
import uz.jl.dto.subject.SubjectDto;
import uz.jl.dto.subject.SubjectUpdateDto;
import uz.jl.entity.subject.Subject;
import uz.jl.mappers.subject.SubjectMapper;
import uz.jl.repository.subject.SubjectRepository;
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
public class SubjectService extends AbstractService<SubjectRepository, SubjectMapper>
implements GenericCrudService<Subject,SubjectCreateDto, SubjectUpdateDto, ObjectId>, BaseGenericService {
    public SubjectService(SubjectRepository repository, SubjectMapper mapper) {
        super(repository, mapper);
    }

    @Override
    public ResponseEntity<Data<ObjectId>> create(SubjectCreateDto createDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> delete(ObjectId key) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Void>> update(SubjectUpdateDto updateDto) {
        return null;
    }

    @Override
    public ResponseEntity<Data<Subject>> get(ObjectId id) {
        return null;
    }

    @Override
    public ResponseEntity<Data<List<Subject>>> getList() {
        return null;
    }
}
