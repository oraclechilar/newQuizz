package uz.jl.dto.subject;

import lombok.*;
import uz.jl.dto.GenericBaseDto;
import uz.jl.dto.GenericDto;
import uz.jl.entity.test.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bakhromjon Wed, 9:39 AM 1/26/2022
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubjectCreateDto implements GenericBaseDto {
    private String name;
    private List<Test> tests = new ArrayList<>();
}
