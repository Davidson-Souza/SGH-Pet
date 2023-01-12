package com.sghpet.sgh.pet;

import com.sghpet.sgh.pet.controller.AccomodationController;
import com.sghpet.sgh.pet.controller.AnimalController;
import com.sghpet.sgh.pet.controller.CustomerController;
import com.sghpet.sgh.pet.controller.EmployeeController;
import com.sghpet.sgh.pet.controller.PaymentController;
import com.sghpet.sgh.pet.controller.ReservationController;
import com.sghpet.sgh.pet.controller.ServicesController;
import com.sghpet.sgh.pet.model.dao.AccomodationDAO;
import com.sghpet.sgh.pet.model.dao.AnimalDAO;
import com.sghpet.sgh.pet.model.dao.CustomerDAO;
import com.sghpet.sgh.pet.model.dao.EmployeeDAO;
import com.sghpet.sgh.pet.model.dao.PaymentDAO;
import com.sghpet.sgh.pet.model.dao.ReservationDAO;
import com.sghpet.sgh.pet.model.dao.ServicesDAO;
import com.sghpet.sgh.pet.view.FrAnimalCareFunction;
import com.sghpet.sgh.pet.view.FrAnimalRegister;
import com.sghpet.sgh.pet.view.FrClerkFunction;
import com.sghpet.sgh.pet.view.FrGroundskeeperFunction;
import com.sghpet.sgh.pet.view.FrMainMenu;
import javax.persistence.Persistence;

public class SGHPet {

    public static void main(String[] args) {

        var fac = Persistence.createEntityManagerFactory("exemplo-jpa");
        var manager = fac.createEntityManager();
        var rep = new EmployeeDAO(manager);
        var userRep = new CustomerDAO(manager);
        var animalRep = new AnimalDAO(manager);
        var reservationRep = new ReservationDAO(manager);
        var serviceRep = new ServicesDAO(manager);
        var paymentRep = new PaymentDAO(manager);
        var accomodationRep = new AccomodationDAO(manager);

        EmployeeController.initiateController(rep);
        CustomerController.getCustomerController(userRep);
        AnimalController.getAnimalController(animalRep);
        ReservationController.getReservationController(reservationRep);
        ServicesController.getServicesController(serviceRep);
        PaymentController.getPaymentController(paymentRep);
        AccomodationController.getAccomodationController(accomodationRep);

        //var tela = new FrAnimalRegister();
        var tela = new FrMainMenu();
        var tela1 = new FrGroundskeeperFunction(tela);
        tela1.show();

    }
}
