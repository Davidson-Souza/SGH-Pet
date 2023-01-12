package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Payment;
import java.util.List;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PaymentDAO implements Persistence {

    private EntityManager repository;

    @Override
    public void create(Object obj) {
        repository.getTransaction().begin();
        repository.persist(obj);
        repository.getTransaction().commit();
    }

    @Override
    public Object get(int id) {
        return this.repository.find(Payment.class, id);
    }

    @Override
    public Object find(Object pCpf) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void delete(Object obj) {
        try {
            this.repository.remove(obj);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void update(Object newObject) {
        repository.merge(newObject);
    }

    public List<Payment> list() {
        this.repository.getTransaction().begin();
        var res = this.repository.createQuery("SELECT p FROM Payment p", Payment.class)
                .getResultList();
        this.repository.getTransaction().commit();
        return res;
    }
}
