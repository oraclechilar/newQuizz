package uz.jl.ui;

import uz.jl.response.Data;
import uz.jl.response.ResponseEntity;
import uz.jl.services.BaseGenericService;

/**
 * @author : softi  -> @data :1/26/2022 23:00
 */

public class BaseUI<S extends BaseGenericService> {
    protected final S service;

    public BaseUI(S service) {
        this.service = service;
    }
    public <T> void showResponse(ResponseEntity<Data<T>> response) {
        System.out.println(response.toString());
    }
}