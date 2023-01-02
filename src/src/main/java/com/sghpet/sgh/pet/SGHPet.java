package com.sghpet.sgh.pet;

import com.sghpet.sgh.pet.controller.EmployeeController;
import com.sghpet.sgh.pet.model.dao.EmployeeDAO;
import com.sghpet.sgh.pet.view.FrEmployeeLogin;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SGHPet {

    public static void main(String[] args) {
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager manager = fac.createEntityManager();

        EmployeeDAO dao = new EmployeeDAO(manager);
        EmployeeController controller = new EmployeeController(dao);
        FrEmployeeLogin fr = new FrEmployeeLogin(controller);
        fr.show();
    }
}
