package uz.jl.entity.answer;

import lombok.*;
import org.bson.types.ObjectId;
import uz.jl.entity.Auditable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Answer extends Auditable {
    private String text;
    private boolean is_correct;
    private boolean is_selected;
}
