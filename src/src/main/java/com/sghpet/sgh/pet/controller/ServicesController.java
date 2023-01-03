package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Services;
import com.sghpet.sgh.pet.model.dao.ServicesDAO;
import com.sun.istack.NotNull;
import java.util.List;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ServicesController {

    private static ServicesController controller;
    @NotNull
    private ServicesDAO repository;

    public static ServicesController getServicesController(ServicesDAO manager) {
        if (getServicesController() == null) {
            ServicesController.controller = new ServicesController(manager);
        }
        return getServicesController();
    }

    public static ServicesController getServicesController() {
        return ServicesController.controller;
    }

    public void create(Services service) {
        this.repository.create(service);
    }

    public List<Services> list(int id) {
        return this.repository.list(id);
    }
}
