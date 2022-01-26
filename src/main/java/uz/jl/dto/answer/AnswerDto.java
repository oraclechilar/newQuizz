package uz.jl.dto.answer;

import lombok.*;
import uz.jl.dto.GenericDto;

/**
 * @author Bakhromjon Wed, 9:36 AM 1/26/2022
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerDto extends GenericDto {
    private String text;
    private boolean is_correct;
    private boolean is_selected;
}
