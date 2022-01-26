package uz.jl.dto.quiz;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.jl.dto.GenericDto;

/**
 * @author Bakhromjon Wed, 9:37 AM 1/26/2022
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QuizUpdateDto extends GenericDto {
    private boolean completed;
}
