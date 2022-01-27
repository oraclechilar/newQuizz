package uz.jl.entity.subject;

import lombok.*;
import org.bson.types.ObjectId;
import uz.jl.entity.Auditable;
import uz.jl.entity.test.Test;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject extends Auditable {
    private String name;
    private List<Test> tests;
}
