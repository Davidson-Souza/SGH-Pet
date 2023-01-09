package com.sghpet.sgh.pet;

import com.sghpet.sgh.pet.controller.AnimalController;
import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.controller.EmployeeController;
import com.sghpet.sgh.pet.controller.ReservationController;
import com.sghpet.sgh.pet.controller.ServicesController;
import com.sghpet.sgh.pet.model.dao.AnimalDAO;
import com.sghpet.sgh.pet.model.dao.CustomerDAO;
import com.sghpet.sgh.pet.model.dao.EmployeeDAO;
import com.sghpet.sgh.pet.model.dao.ReservationDAO;
import com.sghpet.sgh.pet.model.dao.ServicesDAO;
import com.sghpet.sgh.pet.view.FrEmployeeLogin;
import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.view.FrCustomerRegister;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.sghpet.sgh.pet.view.FrMainMenu;


import com.sghpet.sgh.pet.controller.ReservationController;
import com.sghpet.sgh.pet.model.dao.AnimalDAO;
import com.sghpet.sgh.pet.model.dao.CustomerDAO;
import com.sghpet.sgh.pet.view.FrAnimalRegister;
import com.sghpet.sgh.pet.view.FrCustomerRegister;
import com.sghpet.sgh.pet.view.FrReservationRegister;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.sghpet.sgh.pet.view.FrMainMenu;



public class SGHPet {

    public static void main(String[] args) {

        var fac = Persistence.createEntityManagerFactory("exemplo-jpa");
        var manager = fac.createEntityManager();

        var rep = new EmployeeDAO(manager);
        var userRep = new CustomerDAO(manager);
        var animalRep = new AnimalDAO(manager);
        var reservationRep = new ReservationDAO(manager);
        var serviceRep = new ServicesDAO(manager);

        EmployeeController.initiateController(rep);
        CustomerController.getCustomerController(userRep);
        AnimalController.getAnimalController(animalRep);
        ReservationController.getReservationController(reservationRep);
        ServicesController.getServicesController(serviceRep);

        var login = new FrEmployeeLogin();
        login.show();
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager manager = fac.createEntityManager();
        // Animal register
        CustomerController animalController = new CustomerController(manager);
        FrCustomerRegister animalRegister = new FrCustomerRegister(animalController);
        animalRegister.show();
        FrMainMenu menu = new FrMainMenu();
        menu.show();
        
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
        FrMainMenu menu = new FrMainMenu();
        menu.show();
        
    }
}
