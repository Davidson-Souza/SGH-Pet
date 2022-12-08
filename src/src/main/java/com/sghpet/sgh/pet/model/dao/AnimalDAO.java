package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalDAO {

    private EntityManager customerStore;

    public void createAnimal(String name, Customer owner, String type, String postage, boolean hasMedicalCondition) {
        try {
            Animal newAnimal = new Animal();
            newAnimal.fromFields(name, owner, type, postage, hasMedicalCondition);

            customerStore.getTransaction().begin();
            customerStore.persist(newAnimal);
            customerStore.getTransaction().commit();
        } catch (RuntimeErrorException e) {
            throw e;
        }
    }
}
