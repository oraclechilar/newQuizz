package uz.jl.entity.quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.entity.Auditable;
import uz.jl.entity.test.Test;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Quiz extends Auditable {
    private List<Test> tests;
    private Date deadline;
    private boolean is_completed;
    private int mark;
}
