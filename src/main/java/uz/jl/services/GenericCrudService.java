package uz.jl.services;

import uz.jl.dto.GenericBaseDto;
import uz.jl.dto.GenericDto;
import uz.jl.entity.Auditable;
import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;
import uz.jl.ui.AuthUI;

import java.io.Serializable;

/**
 * @author Bakhromjon Wed, 9:59 AM 1/26/2022
 */
public interface GenericCrudService<M extends Auditable, CD extends GenericBaseDto, UD extends GenericDto, K extends Serializable> extends GenericService<M, K> {
    ResponseEntity<Data<K>> create(CD createDto);

    ResponseEntity<Data<Void>> delete(K key);

    ResponseEntity<Data<Void>> update(UD updateDto);
}
