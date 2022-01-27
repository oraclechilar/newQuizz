package uz.jl.dto.test;
import lombok.*;

/**
 * @author Bakhromjon Thu, 11:09 AM 1/27/2022
 */

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkingTestDto {
    private String subjectId;
    private String language;
    private String level;
    private int count;
}
