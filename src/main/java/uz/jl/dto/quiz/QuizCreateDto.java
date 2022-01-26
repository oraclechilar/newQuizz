package uz.jl.dto.quiz;

import uz.jl.dto.GenericBaseDto;
import uz.jl.entity.test.Test;

import java.util.Date;
import java.util.List;

/**
 * @author Bakhromjon Wed, 9:36 AM 1/26/2022
 */
public class QuizCreateDto implements GenericBaseDto {
    private List<Test> tests;
    private Date deadline;
}
