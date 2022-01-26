package uz.jl.entity.subject;

import lombok.*;
import org.bson.types.ObjectId;
import uz.jl.entity.GenericCollection;
import uz.jl.entity.test.Test;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Subject extends GenericCollection {
    private String name;
    private List<Test> tests;

    @Builder(builderMethodName = "childBuilder")
    public Subject(ObjectId id, String name, List<Test> tests) {
        super(id);
        this.name = name;
        this.tests = tests;
    }
}
