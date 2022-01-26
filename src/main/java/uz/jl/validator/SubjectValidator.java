package uz.jl.validator;

import org.bson.types.ObjectId;
import uz.jl.dto.subject.SubjectCreateDto;
import uz.jl.dto.subject.SubjectUpdateDto;

/**
 * @author Bakhromjon Wed, 4:26 PM 1/26/2022
 */
public class SubjectValidator extends BaseValidator<
        SubjectCreateDto, SubjectUpdateDto, ObjectId>{


    @Override
    protected void validKey(ObjectId key) throws IllegalArgumentException {

    }

    @Override
    protected void validOnCreate(SubjectCreateDto dto) throws IllegalArgumentException {

    }

    @Override
    protected void validOnUpdate(SubjectUpdateDto dto) throws IllegalArgumentException {

    }
}
