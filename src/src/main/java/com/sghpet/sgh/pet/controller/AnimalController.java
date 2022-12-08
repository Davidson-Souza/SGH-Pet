package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.dao.AnimalDAO;

public class AnimalController {

    protected AnimalDAO repository;

    public AnimalController(AnimalDAO manager) {
        this.repository = manager;
    }

    public void createAnimal(String name, Customer owner, String type, String postage, boolean hasMedicalCondition) {
        this.repository.createAnimal(name, owner, type, postage, hasMedicalCondition);
    }
}
