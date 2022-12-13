package com.sghpet.sgh.pet;

import com.sghpet.sgh.pet.controller.AnimalController;
import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.controller.ReservationController;
import com.sghpet.sgh.pet.model.dao.AnimalDAO;
import com.sghpet.sgh.pet.model.dao.CustomerDAO;
import com.sghpet.sgh.pet.view.FrAnimalRegister;
import com.sghpet.sgh.pet.view.FrCustomerRegister;
import com.sghpet.sgh.pet.view.FrReservationRegister;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SGHPet {

    public static void main(String[] args) {
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager manager = fac.createEntityManager();

        // Customer register
        CustomerDAO customerRep = new CustomerDAO(manager);
        CustomerController customerController = new CustomerController(customerRep);
        FrCustomerRegister customerRegister = new FrCustomerRegister(customerController);
        customerRegister.show();

        // Animal register
        AnimalDAO animalRep = new AnimalDAO(manager);

        AnimalController animalController = new AnimalController(animalRep);
        FrAnimalRegister animalRegister = new FrAnimalRegister(animalController, customerController);
        animalRegister.show();

        // Reservation registration
        ReservationController reservationController = new ReservationController(manager);
        FrReservationRegister reservationRegister = new FrReservationRegister(reservationController);
        reservationRegister.show();
    }
}
