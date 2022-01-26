package uz.jl.mappers;

import uz.jl.dto.GenericBaseDto;
import uz.jl.dto.GenericDto;
import uz.jl.entity.Auditable;

/**
 * @author Bakhromjon Wed, 3:25 PM 1/26/2022
 */
public interface GenericMapper<
        E extends Auditable,
        D extends GenericDto,
        CD extends GenericBaseDto,
        UD extends GenericDto> extends GenericBaseMapper{
    E fromDto(D dto);

    E fromCreateDto(CD dto);

    E fromUpdateDto(UD dto);

    D toDto(E entity);
}
