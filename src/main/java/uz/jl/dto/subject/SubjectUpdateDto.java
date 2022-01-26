package uz.jl.dto.subject;

import lombok.*;
import uz.jl.dto.GenericDto;
import uz.jl.entity.test.Test;

import java.util.List;

/**
 * @author Bakhromjon Wed, 9:39 AM 1/26/2022
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubjectUpdateDto extends GenericDto {
    private String name;
    private List<Test> tests;
}
