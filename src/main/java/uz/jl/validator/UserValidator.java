package uz.jl.validator;

import org.bson.types.ObjectId;
import uz.jl.dto.auth.UserCreateDto;
import uz.jl.dto.auth.UserUpdateDto;
import uz.jl.utils.BaseUtils;

/**
 * @author Bakhromjon Wed, 4:26 PM 1/26/2022
 */
public class UserValidator extends BaseValidator<
        UserCreateDto, UserUpdateDto, ObjectId> {

    public UserValidator(BaseUtils utils) {
        super(utils);
    }

    @Override
    public void validKey(ObjectId key) throws IllegalArgumentException {

    }

    @Override
    public void validOnCreate(UserCreateDto dto) throws IllegalArgumentException {

    }

    @Override
    public void validOnUpdate(UserUpdateDto dto) throws IllegalArgumentException {

    }
}
