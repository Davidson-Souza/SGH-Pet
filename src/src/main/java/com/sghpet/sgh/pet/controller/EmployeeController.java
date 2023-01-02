package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Employee;
import com.sghpet.sgh.pet.model.dao.EmployeeDAO;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeController {

    private EmployeeDAO repository;

    public boolean signIn(String cpf, String password) {

        var employee = (Employee) this.repository.find(cpf);
        return employee.getPassword().equals(password);
    }

}
