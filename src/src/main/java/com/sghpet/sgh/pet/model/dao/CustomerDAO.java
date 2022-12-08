package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Customer;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomerDAO {

    private EntityManager customerStore;

    /**
     * Creates a new user given it's data.This function might throw some
     * exception if the information is invalid or the database isn't working.
     *
     * @param name: The user name
     * @param cpf: The user cpf
     * @param address: The user address line
     * @param phone: A contact phone
     */
    public void createUser(String name, String cpf, String address, String phone) {
        Customer customer = new Customer(name, cpf, address, phone);
        this.customerStore.getTransaction().begin();
        this.customerStore.persist(customer);
        this.customerStore.getTransaction().commit();
    }

    /**
     * Get customer giving it's id.If you need to find a user by cpf, use
     * findCustomerByCpf.This function might throw an exception if the database
     * isn't working.
     *
     * @param id: integer, A user id
     * @return Customer
     */
    public Customer getCustumer(int id) {
        return this.customerStore.find(Customer.class, id);
    }

    /**
     * Returns the user with a given cpf.Since cpf is unique per user, we use it
     * to uniquely identify an user.inside the system interface. This function
     * might throw an exception if the database isn't working.
     *
     * @param cpf: The user's cpf
     * @return Customer
     */
    public Customer findCustomerByCPF(String cpf) {
        try {

            customerStore.getTransaction().begin();
            var res = customerStore.createQuery("SELECT c FROM Customer c WHERE c.cpf LIKE :cpf", Customer.class)
                    .setParameter("cpf", cpf)
                    .getSingleResult();
            customerStore.getTransaction().commit();
            return res;

        } catch (RuntimeException e) {
            throw e;
        }
    }
}
