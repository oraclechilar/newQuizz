package uz.jl.mappers.quiz;

import uz.jl.dto.quiz.QuizCreateDto;
import uz.jl.dto.quiz.QuizDto;
import uz.jl.dto.quiz.QuizUpdateDto;
import uz.jl.dto.subject.SubjectCreateDto;
import uz.jl.dto.subject.SubjectDto;
import uz.jl.dto.subject.SubjectUpdateDto;
import uz.jl.entity.quiz.Quiz;
import uz.jl.entity.subject.Subject;
import uz.jl.mappers.GenericMapper;

/**
 * @author Bakhromjon Wed, 4:00 PM 1/26/2022
 */
public class QuizMapper implements GenericMapper<Quiz, QuizDto, QuizCreateDto, QuizUpdateDto> {
    @Override
    public Quiz fromDto(QuizDto dto) {
        return null;
    }

    @Override
    public Quiz fromCreateDto(QuizCreateDto dto) {
        return null;
    }

    @Override
    public Quiz fromUpdateDto(QuizUpdateDto dto) {
        return null;
    }

    @Override
    public QuizDto toDto(Quiz entity) {
        return null;
    }
}
