package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Employee;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeDAO implements Persistence {

    private EntityManager store;

    @Override
    public void create(Object obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object get(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object find(Object pCpf) {
        store.getTransaction().begin();

        try {
            String cpf = (String) pCpf;
            var res = store.createQuery("SELECT e FROM Employee e WHERE e.cpf LIKE :cpf", Employee.class)
                    .setParameter("cpf", cpf)
                    .getSingleResult();
            store.getTransaction().commit();
            return res;
        } catch (RuntimeException e) {
            store.getTransaction().commit();

            throw e;
        }
    }

    @Override
    public void delete(Object obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Object newObject) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
