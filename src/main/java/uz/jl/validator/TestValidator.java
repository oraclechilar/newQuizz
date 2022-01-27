package uz.jl.validator;

import org.bson.types.ObjectId;
import uz.jl.dto.test.TestCreateDto;
import uz.jl.dto.test.TestUpdateDto;
import uz.jl.utils.BaseUtils;


/**
 * @author Bakhromjon Wed, 4:26 PM 1/26/2022
 */
public class TestValidator extends BaseValidator<
        TestCreateDto, TestUpdateDto, ObjectId>{


    protected TestValidator(BaseUtils utils) {
        super(utils);
    }

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
