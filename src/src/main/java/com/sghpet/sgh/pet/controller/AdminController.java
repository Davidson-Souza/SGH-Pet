package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Employee;
import com.sghpet.sgh.pet.model.EmployeeType;
import com.sghpet.sgh.pet.model.TmEmployees;
import javax.swing.JTable;

public class AdminController {

    // Returns whether or not the system is initialized
    public static boolean isInitialized() {
        var employees = EmployeeController.getEmployeeController().list();
        for (var employee : employees) {
            if (employee.getJob() == EmployeeType.Admin) {
                return true;
            }
        }
        return false;
    }

    public static void updateEmployee(Employee oldEmployee, String cpf, String name, int nJob, String password) {
        switch (nJob) {
            case 0 ->
                oldEmployee.setJob(EmployeeType.Admin);
            case 1 ->
                oldEmployee.setJob(EmployeeType.Clerk);
            case 2 ->
                oldEmployee.setJob(EmployeeType.Groundkeeper);
            case 3 ->
                oldEmployee.setJob(EmployeeType.Manager);
            case 4 ->
                oldEmployee.setJob(EmployeeType.Servicer);
            default ->
                throw new RuntimeException("Tipo de trabalho inválido " + nJob);
        }
        oldEmployee.setCpf(cpf);
        oldEmployee.setName(name);
        oldEmployee.setPassword(password);

        EmployeeController.getEmployeeController().update(oldEmployee);
    }

    public static void updateTable(JTable grdPayment) {
        var employees = EmployeeController.getEmployeeController().list();
        System.out.println(employees);
        var emp = new TmEmployees(employees);
        grdPayment.setModel(emp);
    }

    public static void createEmployee(String cpf, String name, int nJob, String password) {
        try {
            if (EmployeeController.getEmployeeController().findByCpf(cpf) != null) {
                throw new RuntimeException("Erro: Usuário existente");
            }
        } catch (RuntimeException e) {
            if (!"No entity found for query".equals(e.getMessage())) {
                throw e;
            }
        }

        EmployeeType job;
        switch (nJob) {
            case 0 ->
                job = EmployeeType.Admin;
            case 1 ->
                job = EmployeeType.Clerk;
            case 2 ->
                job = EmployeeType.Groundkeeper;
            case 3 ->
                job = EmployeeType.Manager;
            case 4 ->
                job = EmployeeType.Servicer;
            default ->
                throw new RuntimeException("Tipo de trabalho inválido " + nJob);
        }

        EmployeeController.getEmployeeController().create(cpf, name, job, password);
    }
}
