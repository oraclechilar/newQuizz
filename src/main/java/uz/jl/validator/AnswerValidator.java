package uz.jl.utils.validator;

import org.bson.types.ObjectId;
import uz.jl.dto.answer.AnswerCreateDto;
import uz.jl.dto.answer.AnswerUpdateDto;


/**
 * @author Bakhromjon Wed, 4:26 PM 1/26/2022
 */
public class AnswerValidator extends BaseValidator<
        AnswerCreateDto, AnswerUpdateDto, ObjectId>{


    @Override
    protected void validKey(ObjectId key) throws IllegalArgumentException {

    }

    @Override
    protected void validOnCreate(AnswerCreateDto dto) throws IllegalArgumentException {

    }

    @Override
    protected void validOnUpdate(AnswerUpdateDto dto) throws IllegalArgumentException {

    }
}
