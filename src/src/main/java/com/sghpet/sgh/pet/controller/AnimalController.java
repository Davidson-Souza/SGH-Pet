package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.dao.AnimalDAO;

public class AnimalController {

    protected AnimalDAO repository;
    private static AnimalController contr;

    private AnimalController(AnimalDAO manager) {
        this.repository = manager;
    }

    public static AnimalController getAnimalController(AnimalDAO manager) {
        if (getAnimalController() == null) {
            AnimalController.contr = new AnimalController(manager);
        }
        return getAnimalController();
    }

    public static AnimalController getAnimalController() {
        return AnimalController.contr;
    }

    public void createAnimal(String name, Customer owner, String type, String postage, boolean hasMedicalCondition) {
        Animal newAnimal = new Animal(name, owner, type, postage, hasMedicalCondition);

        this.repository.create(newAnimal);
    }
}
