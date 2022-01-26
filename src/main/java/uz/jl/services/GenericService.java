package uz.jl.services;

import uz.jl.criteria.GenericCriteria;
import uz.jl.dto.GenericDto;
import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * @author Bakhromjon Wed, 9:55 AM 1/26/2022
 */
public interface GenericService<D extends GenericDto, C extends GenericCriteria, K extends Serializable> {
    ResponseEntity<Data<List<D>>> list(C criteria);

    ResponseEntity<Data<D>> get(K key);
}
