package uz.jl.validator;

import org.bson.types.ObjectId;
import uz.jl.dto.quiz.QuizCreateDto;
import uz.jl.dto.quiz.QuizUpdateDto;


/**
 * @author Bakhromjon Wed, 4:26 PM 1/26/2022
 */
public class QuizValidator extends BaseValidator<
        QuizCreateDto, QuizUpdateDto, ObjectId>{


    @Override
    protected void validKey(ObjectId key) throws IllegalArgumentException {

    }

    @Override
    protected void validOnCreate(QuizCreateDto dto) throws IllegalArgumentException {

    }

    @Override
    protected void validOnUpdate(QuizUpdateDto dto) throws IllegalArgumentException {

    }
}
