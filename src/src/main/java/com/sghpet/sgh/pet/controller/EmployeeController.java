package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Employee;
import com.sghpet.sgh.pet.model.EmployeeType;
import com.sghpet.sgh.pet.model.dao.EmployeeDAO;
import java.util.List;

public class EmployeeController {

    private static EmployeeController controller;
    private final EmployeeDAO repository;

    public static EmployeeController getEmployeeController() {
        return EmployeeController.controller;
    }

    public Employee findByCpf(String cpf) {
        return (Employee) this.repository.find(cpf);
    }

    private EmployeeController(EmployeeDAO repo) {
        this.repository = repo;
    }

    public void update(Employee newEmployee) {
        this.repository.update(newEmployee);
    }

    public static void initiateController(EmployeeDAO repo) {
        EmployeeController.controller = new EmployeeController(repo);
    }

    public Employee signIn(String cpf, String password) {
        return (Employee) this.repository.find(cpf);
    }

    public List<Employee> list() {
        return this.repository.list();
    }

    public void create(String cpf, String name, EmployeeType job, String password) {
        Employee emp = new Employee(name, cpf, 1000, 1000, true, password, job);
        this.repository.create(emp);
    }

    public Employee get(int id) {
        return (Employee) this.repository.get(id);
    }
}
