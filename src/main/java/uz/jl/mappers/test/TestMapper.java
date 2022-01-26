package uz.jl.mappers.test;

import uz.jl.dto.subject.SubjectCreateDto;
import uz.jl.dto.subject.SubjectDto;
import uz.jl.dto.subject.SubjectUpdateDto;
import uz.jl.dto.test.TestCreateDto;
import uz.jl.dto.test.TestDto;
import uz.jl.dto.test.TestUpdateDto;
import uz.jl.entity.subject.Subject;
import uz.jl.entity.test.Test;
import uz.jl.mappers.GenericMapper;

/**
 * @author Bakhromjon Wed, 4:00 PM 1/26/2022
 */
public class TestMapper implements GenericMapper<Test, TestDto, TestCreateDto, TestUpdateDto> {
    @Override
    public Test fromDto(TestDto dto) {
        return null;
    }

    @Override
    public Test fromCreateDto(TestCreateDto dto) {
        return null;
    }

    @Override
    public Test fromUpdateDto(TestUpdateDto dto) {
        return null;
    }

    @Override
    public TestDto toDto(Test entity) {
        return null;
    }
}
