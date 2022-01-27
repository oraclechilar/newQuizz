package uz.jl.ui;

import uz.jl.services.BaseGenericService;

/**
 * @author : softi  -> @data :1/26/2022 23:00
 */

public class BaseUI<S extends BaseGenericService> {
    protected final S service;

    public BaseUI(S service) {
        this.service = service;
    }
}