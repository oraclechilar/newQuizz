package uz.jl.mappers.subject;

import org.bson.types.ObjectId;
import uz.jl.dto.subject.SubjectCreateDto;
import uz.jl.dto.subject.SubjectDto;
import uz.jl.dto.subject.SubjectUpdateDto;
import uz.jl.entity.subject.Subject;
import uz.jl.mappers.GenericMapper;

/**
 * @author Bakhromjon Wed, 4:00 PM 1/26/2022
 */
public class SubjectMapper implements GenericMapper<Subject, SubjectDto,SubjectCreateDto, SubjectUpdateDto> {
    @Override
    public Subject fromDto(SubjectDto dto) {
        return null;
    }

    @Override
    public Subject fromCreateDto(SubjectCreateDto dto) {
        return null;
    }

    @Override
    public Subject fromUpdateDto(SubjectUpdateDto dto) {
        return null;
    }

    @Override
    public SubjectDto toDto(Subject entity) {
        return null;
    }
}
