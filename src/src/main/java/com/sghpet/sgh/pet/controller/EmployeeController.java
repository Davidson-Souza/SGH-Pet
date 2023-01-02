package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Employee;
import com.sghpet.sgh.pet.model.dao.EmployeeDAO;

public class EmployeeController {

    private static EmployeeController controller;
    private final EmployeeDAO repository;

    public static EmployeeController getEmployeeController() {
        return EmployeeController.controller;
    }

    private EmployeeController(EmployeeDAO repo) {
        this.repository = repo;
    }

    public static void initiateController(EmployeeDAO repo) {
        EmployeeController.controller = new EmployeeController(repo);
    }

    public Employee signIn(String cpf, String password) {
        return (Employee) this.repository.find(cpf);
    }
}
