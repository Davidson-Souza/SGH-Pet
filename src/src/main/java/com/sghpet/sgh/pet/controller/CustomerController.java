package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.dao.CustomerDAO;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CustomerController {

    private CustomerDAO repository;
    private static CustomerController controller;

    public static CustomerController getCustomerController(CustomerDAO manager) {
        if (getCustomerController() == null) {
            CustomerController.controller = new CustomerController(manager);
        }
        return getCustomerController();
    }

    public static CustomerController getCustomerController() {
        return CustomerController.controller;
    }

    public void deleteUser(int id) {
        this.repository.delete(id);
    }

    /**
     * Creates a new user given it's data.This function might throw some
     * exception if the information is invalid or the database isn't working.
     *
     * @param name: The user name
     * @param cpf: The user cpf
     * @param address: The user address line
     * @param phone: A contact phone
     */
    public void createUser(String name, String cpf, String address, String phone) throws RuntimeException {
        try {
            var customer = new Customer(name, cpf, address, phone);
            this.repository.create(customer);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void updateCustomer(Object newCustomer) {
        this.repository.update(newCustomer);
    }

    /**
     * Get customer giving it's id.If you need to find a user by cpf, use
     * findCustomerByCpf.This function might throw an exception if the database
     * isn't working.
     *
     * @param id: integer, A user id
     * @return Customer
     */
    public Customer getCustumer(int id) throws RuntimeException {
        return this.repository.get(id);
    }

    /**
     * Returns the user with a given cpf.Since cpf is unique per user, we use it
     * to uniquely identify an user.inside the system interface. This function
     * might throw an exception if the database isn't working.
     *
     * @param cpf: The user's cpf
     * @return Customer
     */
    public Customer findCustomerByCPF(String cpf) throws RuntimeException {
        return (Customer) this.repository.find(cpf);
    }
}
