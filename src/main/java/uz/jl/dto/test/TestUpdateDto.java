package uz.jl.dto.test;

import lombok.Getter;
import lombok.Setter;
import uz.jl.dto.GenericDto;

/**
 * @author Bakhromjon Wed, 9:39 AM 1/26/2022
 */
@Getter
@Setter
public class TestUpdateDto extends GenericDto {
    private String question;
}
