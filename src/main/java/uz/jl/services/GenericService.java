package uz.jl.services;

import uz.jl.criteria.GenericCriteria;
import uz.jl.dto.GenericDto;
import uz.jl.entity.Auditable;
import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * @author Bakhromjon Wed, 9:55 AM 1/26/2022
 */
public interface GenericService<M extends Auditable, K extends Serializable> {
    ResponseEntity<Data<M>> get(K id);

    ResponseEntity<Data<List<M>>> getList();
}
