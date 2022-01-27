package uz.jl.dto.quiz;

import lombok.*;
import uz.jl.dto.GenericDto;
import uz.jl.entity.test.Test;

import java.util.Date;
import java.util.List;

/**
 * @author Bakhromjon Wed, 9:36 AM 1/26/2022
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuizDto extends GenericDto {
    private List<Test> tests;
    private Date deadline;
    private boolean completed;
    private int mark;
}
