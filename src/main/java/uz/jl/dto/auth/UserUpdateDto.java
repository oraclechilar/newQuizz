package uz.jl.dto.auth;

import lombok.*;
import uz.jl.dto.GenericDto;
import uz.jl.entity.quiz.Quiz;

import java.util.List;

/**
 * @author Bakhromjon Wed, 9:37 AM 1/26/2022
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserUpdateDto extends GenericDto {
    private String username;
    private String password;
    private String language;
}
