package uz.jl.mappers.answer;

import uz.jl.dto.answer.AnswerCreateDto;
import uz.jl.dto.answer.AnswerDto;
import uz.jl.dto.answer.AnswerUpdateDto;
import uz.jl.dto.subject.SubjectCreateDto;
import uz.jl.dto.subject.SubjectDto;
import uz.jl.dto.subject.SubjectUpdateDto;
import uz.jl.entity.answer.Answer;
import uz.jl.entity.subject.Subject;
import uz.jl.mappers.GenericMapper;

/**
 * @author Bakhromjon Wed, 4:00 PM 1/26/2022
 */
public class AnswerMapper implements GenericMapper<Answer, AnswerDto, AnswerCreateDto, AnswerUpdateDto> {
    @Override
    public Answer fromDto(AnswerDto dto) {
        return null;
    }

    @Override
    public Answer fromCreateDto(AnswerCreateDto dto) {
        return null;
    }

    @Override
    public Answer fromUpdateDto(AnswerUpdateDto dto) {
        return null;
    }

    @Override
    public AnswerDto toDto(Answer entity) {
        return null;
    }
}
