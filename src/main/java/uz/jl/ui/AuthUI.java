package uz.jl.ui;

import org.bson.types.ObjectId;
import uz.jl.dto.auth.UserCreateDto;
import uz.jl.enums.Role;
import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;
import uz.jl.security.SecurityHolder;
import uz.jl.services.BaseGenericService;
import uz.jl.services.user.UserService;
import uz.jl.utils.Input;
import uz.jl.utils.Print;

/**
 * @author : softi  -> @data :1/26/2022 23:02
 */

public class AuthUI extends BaseUI<UserService> {

    public AuthUI(UserService service) {
        super(service);
    }

    public void register() {
        UserCreateDto dto = UserCreateDto.builder().username(Input.getStr("Username: ")).password(Input.getStr("Password:")).language(Input.getStr("Language:")).role(Input.getStr("Role: ")).build();
        ResponseEntity<Data<ObjectId>> response = service.create(dto);
        Print.println(response.getData().getBody());
    }

    public void login() {
        String username = Input.getStr("Username: ");
        String password = Input.getStr("Password: ");
        ResponseEntity<Data<Boolean>> response = service.login(username, password);
        Print.println(SecurityHolder.session.getUsername() + " " + response.getData().getBody());
        if (SecurityHolder.session.getRole().equals(Role.getByName("STUDENT"))) {

        }
    }

    public void logout() {
        SecurityHolder.killSession();
    }


}
