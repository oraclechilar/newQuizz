package uz.jl.repository;

import uz.jl.dto.GenericBaseDto;
import uz.jl.dto.GenericDto;
import uz.jl.entity.Auditable;

import java.io.Serializable;

/**
 * @author Bakhromjon Wed, 9:21 AM 1/26/2022
 */
public interface GenericCrudRepository<
        E extends Auditable,
        K extends Serializable>{
    K create(E entity);

    void delete(K key);

    void update(E entity);
}
