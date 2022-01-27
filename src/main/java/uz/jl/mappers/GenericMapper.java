package uz.jl.mappers;

import uz.jl.dto.GenericBaseDto;
import uz.jl.dto.GenericDto;
import uz.jl.entity.Auditable;

/**
 * @author Bakhromjon Wed, 3:25 PM 1/26/2022
 */
public interface GenericMapper<M, D, CD, UD> extends GenericBaseMapper{
    M fromDto(D dto);

    M fromCreateDto(CD dto);

    M fromUpdateDto(UD dto);

    D toDto(M model);
}
