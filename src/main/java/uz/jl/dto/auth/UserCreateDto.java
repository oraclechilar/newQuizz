package uz.jl.dto.auth;

import lombok.*;
import uz.jl.dto.GenericBaseDto;

/**
 * @author Bakhromjon Wed, 9:36 AM 1/26/2022
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserCreateDto implements GenericBaseDto {
    private String username;
    private String password;
    private String email;
}
