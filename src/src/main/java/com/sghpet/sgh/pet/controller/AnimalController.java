package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;

public class AnimalController {

    protected EntityManager db;

    public AnimalController(EntityManager manager) {
        this.db = manager;
    }

    public void createAnimal(String name, Customer owner, String type, String postage, boolean hasMedicalCondition) {
        try {
            Animal newAnimal = new Animal();
            newAnimal.fromFields(name, owner, type, postage, hasMedicalCondition);

            db.getTransaction().begin();
            db.persist(newAnimal);
            db.getTransaction().commit();
        } catch (RuntimeErrorException e) {
            throw e;
        }
    }
}
