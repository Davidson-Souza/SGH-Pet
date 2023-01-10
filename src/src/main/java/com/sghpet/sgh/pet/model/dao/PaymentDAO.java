package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Payment;
import java.util.List;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PaymentDAO implements Persistence {

    private EntityManager store;

    @Override
    public void create(Object obj) {
        store.getTransaction().begin();
        store.persist(obj);
        store.getTransaction().commit();
    }

    @Override
    public Object get(int id) {
        return this.store.find(Payment.class, id);
    }

    @Override
    public Object find(Object pCpf) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void delete(Object obj) {
        try {
            this.store.remove(obj);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void update(Object newObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Payment> list() {
        this.store.getTransaction().begin();
        var res = this.store.createQuery("SELECT p FROM Payment p", Payment.class)
                .getResultList();
        this.store.getTransaction().commit();
        return res;
    }
}
