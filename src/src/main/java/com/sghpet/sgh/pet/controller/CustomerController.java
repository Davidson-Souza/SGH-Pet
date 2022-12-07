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
        var res = customerStore.createQuery("SELECT c FROM Customer c WHERE c.cpf LIKE :cpf", Customer.class)
                .setParameter("cpf", "00000000000")
                .getSingleResult();
        customerStore.getTransaction().commit();

        return res;
    }
}
