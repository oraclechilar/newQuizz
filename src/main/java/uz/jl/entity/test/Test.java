package uz.jl.entity.test;

import lombok.*;
import org.bson.types.ObjectId;
import uz.jl.entity.GenericCollection;
import uz.jl.entity.answer.Answer;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Test extends GenericCollection {
    private String questions;
    private List<Answer> answerList;

    @Builder(builderMethodName = "childBuilder")
    public Test(ObjectId id, String questions, List<Answer> answerList) {
        super(id);
        this.questions = questions;
        this.answerList = answerList;
    }
}
