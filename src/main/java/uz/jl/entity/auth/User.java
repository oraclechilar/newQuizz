package uz.jl.entity.auth;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.bson.types.ObjectId;
import uz.jl.entity.Auditable;
import uz.jl.entity.quiz.Quiz;
import uz.jl.enums.Language;
import uz.jl.enums.Role;
import uz.jl.enums.Status;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends Auditable {
    private String username;
    private String password;
    private Role role;
    private Status status;
    private Language language;
    private List<Quiz> quizzes;
    private Quiz currentQuiz;

    @Builder(builderMethodName = "child_builder")
    public User(ObjectId id, Date createdAt, String username, String password, Role role, Status status, Language language) {
        super(id, createdAt);
        this.username = username;
        this.password = password;
        this.role = role;
        this.status = status;
        this.language = language;
    }
}
