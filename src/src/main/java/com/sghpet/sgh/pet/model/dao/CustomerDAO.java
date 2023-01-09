package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Customer;
import java.sql.PreparedStatement;
import java.util.List;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDAO implements Persistence {

    private EntityManager customerStore;

    @Override
    public void create(Object pCustomer) {
        Customer customer = (Customer) pCustomer;
        this.customerStore.getTransaction().begin();
        this.customerStore.persist(customer);
        this.customerStore.getTransaction().commit();
    }

    public List<Customer> list() {
        customerStore.getTransaction().begin();
        var res = customerStore.createQuery("SELECT c FROM Customer c", Customer.class)
                .getResultList();
        customerStore.getTransaction().commit();
        return res;
    }

    /**
     * Get customer giving it's id.If you need to find a user by cpf, use
     * findCustomerByCpf.This function might throw an exception if the database
     * isn't working.
     *
     * @param id: integer, A user id
     * @return Customer
     */
    @Override
    public Customer get(int id) {
        return this.customerStore.find(Customer.class, id);
    }

    /**
     * Returns the user with a given cpf.Since cpf is unique per user, we use it
     * to uniquely identify an user.inside the system interface.This function
     * might throw an exception if the database isn't working.
     *
     * @param pCpf: The user's cpf
     * @return Customer
     */
    @Override
    public Object find(Object pCpf) {
        try {
            String cpf = (String) pCpf;
            customerStore.getTransaction().begin();
            var res = customerStore.createQuery("SELECT c FROM Customer c WHERE c.cpf LIKE :cpf", Customer.class)
                    .setParameter("cpf", cpf)
                    .getSingleResult();
            customerStore.getTransaction().commit();
            return res;

        } catch (RuntimeException e) {
            customerStore.getTransaction().commit();
            throw e;
        }
    }

    /**
     * Deletes a user with a given id
     *
     * @param obj: The user's id
     */
    @Override
    public void delete(Object obj) {
        try {
            this.customerStore.remove(obj);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    /**
     * Updates an user, the id is already in newObject, so no need to pass it by
     * parameter
     *
     * @param newObject: The new data to persist, id should not change.
     */
    @Override
    public void update(Object newObject) {
        Customer customer = (Customer) newObject;
        
        String querry = "UPDATE Customer "
                + "SET name = ?"
                + "SET phone_number = ?"
                + "SET address = ?"
                + "WHERE id = ?"; 
        try {
            customerStore.getTransaction().begin();
            customerStore.createQuery(querry, Customer.class)
                    .setParameter(":name", customer.getName())
                    .setParameter(":phone_number", customer.getPhoneNumber())
                    .setParameter(":address", customer.getAddress())
                    .setParameter(":id", customer.getId());
                    
            customerStore.getTransaction().commit();

        } catch (RuntimeException e) {
            customerStore.getTransaction().commit();
            throw e;
        }
    }

}