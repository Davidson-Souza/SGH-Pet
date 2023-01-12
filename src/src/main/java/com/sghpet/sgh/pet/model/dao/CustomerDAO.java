package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Customer;
import java.util.List;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDAO implements Persistence {

    private EntityManager database;

    @Override
    public void create(Object pCustomer) {
        Customer customer = (Customer) pCustomer;
        this.database.getTransaction().begin();
        this.database.persist(customer);
        this.database.getTransaction().commit();
    }

    public List<Customer> list() {
        database.getTransaction().begin();
        var res = database.createQuery("SELECT c FROM Customer c", Customer.class)
                .getResultList();
        database.getTransaction().commit();
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
        return this.database.find(Customer.class, id);
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
            database.getTransaction().begin();
            var res = database.createQuery("SELECT c FROM Customer c WHERE c.cpf LIKE :cpf", Customer.class)
                    .setParameter("cpf", cpf)
                    .getSingleResult();
            database.getTransaction().commit();
            return res;

        } catch (RuntimeException e) {
            database.getTransaction().commit();
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
            database.getTransaction().begin();
            this.database.remove(obj);
            database.getTransaction().commit();
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
        database.merge(newObject);
    }
}
