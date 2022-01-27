package uz.jl.repository;

import jdk.dynalink.linker.LinkerServices;
import uz.jl.criteria.GenericBaseCriteria;
import uz.jl.dto.GenericDto;
import uz.jl.entity.Auditable;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * @author Bakhromjon Wed, 9:20 AM 1/26/2022
 */

/**
 *
 * @param <E> Entity
 * @param <C> Criteria
 * @param <K> Key
 */
public interface GenericRepository<
            E extends Auditable,
            C extends GenericBaseCriteria,
            K extends Serializable> {
        List<E> list();

        Optional<E> get(K key);
}
