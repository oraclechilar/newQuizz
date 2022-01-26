package uz.jl.security;

import lombok.*;
import uz.jl.entity.quiz.Quiz;

import java.util.List;

/**
 * @author Bakhromjon Wed, 5:26 PM 1/26/2022
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Session {
    private String username;
    private String password;
    private String email;
    private List<Quiz> quizzes;
}
