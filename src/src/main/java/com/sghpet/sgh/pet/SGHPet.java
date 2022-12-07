package com.sghpet.sgh.pet;

import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.view.FrCustomerRegister;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SGHPet {

    public static void main(String[] args) {
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager manager = fac.createEntityManager();

        // Animal register
        CustomerController animalController = new CustomerController(manager);
        FrCustomerRegister animalRegister = new FrCustomerRegister(animalController);
        animalRegister.show();
    }
}
