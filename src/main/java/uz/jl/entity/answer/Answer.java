package uz.jl.entity.answer;

import lombok.*;
import org.bson.types.ObjectId;
import uz.jl.entity.GenericCollection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Answer extends GenericCollection {
    private String text;
    private String is_correct;
    private String is_selected;

    @Builder(builderMethodName = "childBuilder")
    public Answer(ObjectId id, String text, String is_correct, String is_selected) {
        super(id);
        this.text = text;
        this.is_correct = is_correct;
        this.is_selected = is_selected;
    }
}
