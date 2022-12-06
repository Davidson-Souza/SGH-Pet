package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Customer;
import javax.persistence.EntityManager;

public class CustomerController {

    private EntityManager customerStore;

    public CustomerController(EntityManager customerStore) {
        this.customerStore = customerStore;
    }

    public void createUser(String name, String cpf, String address, String phone) {
        Customer customer = new Customer(name, cpf, address, phone);
        this.customerStore.getTransaction().begin();
        this.customerStore.persist(customer);
        this.customerStore.getTransaction().commit();
    }

    public Customer getCustumer(int id) {
        return this.customerStore.find(Customer.class, id);
    }

    public Customer findCustomerByCPF(String cpf) {
        customerStore.getTransaction().begin();
//        var res = this.customerStore.createQuery(
//                "SELECT id FROM customer WHERE cpf=:cpf")
//                .setParameter("cpf", cpf)
//                .setMaxResults(10)
//                .getResultList();
//        System.out.println(res);
        return null;
    }
}
