package uz.jl.utils.validator;

import org.bson.types.ObjectId;
import uz.jl.dto.test.TestCreateDto;
import uz.jl.dto.test.TestUpdateDto;


/**
 * @author Bakhromjon Wed, 4:26 PM 1/26/2022
 */
public class TestValidator extends BaseValidator<
        TestCreateDto, TestUpdateDto, ObjectId>{


    @Override
    protected void validKey(ObjectId key) throws IllegalArgumentException {

    }

    @Override
    protected void validOnCreate(TestCreateDto dto) throws IllegalArgumentException {

    }

    @Override
    protected void validOnUpdate(TestUpdateDto dto) throws IllegalArgumentException {

    }
}
