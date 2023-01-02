package com.sghpet.sgh.pet;

import com.sghpet.sgh.pet.controller.EmployeeController;
import com.sghpet.sgh.pet.model.dao.EmployeeDAO;
import com.sghpet.sgh.pet.view.FrEmployeeLogin;
import javax.persistence.Persistence;

public class SGHPet {

    public static void main(String[] args) {
        var fac = Persistence.createEntityManagerFactory("exemplo-jpa");
        var manager = fac.createEntityManager();
        var rep = new EmployeeDAO(manager);
        var employeeController = new EmployeeController(rep);

        var login = new FrEmployeeLogin(employeeController);
        login.show();
    }
}
