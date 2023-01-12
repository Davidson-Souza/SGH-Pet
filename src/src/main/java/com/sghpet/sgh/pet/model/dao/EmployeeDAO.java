package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Employee;
import java.util.List;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeDAO implements Persistence {

    private EntityManager store;

    @Override
    public void create(Object obj) {
        store.getTransaction().begin();
        store.persist(obj);
        store.getTransaction().commit();
    }

    @Override
    public Object get(int id) {
        return this.store.find(Employee.class, id);
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
        this.store.merge(newObject);
    }

    public List<Employee> list() {
        store.getTransaction().begin();
        var res = store.createQuery("SELECT e FROM Employee e", Employee.class)
                .getResultList();
        store.getTransaction().commit();
        return res;
    }

}
