package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Services;
import java.util.List;
import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ServicesDAO implements Persistence {

    private EntityManager database;

    @Override
    public void create(Object obj) {
        try {
            database.getTransaction().begin();
            database.persist((Services) obj);
            database.getTransaction().commit();
        } catch (RuntimeErrorException e) {
            throw e;
        }
    }

    @Override
    public Object get(int id) {
        return database.find(Services.class, id);
    }

    @Override
    public Object find(Object uniqueKey) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Object obj) {
        try {
            this.database.remove(obj);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void update(Object newObject) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<Services> list(int id) {
        var res = this.database.createQuery("SELECT s FROM Services s WHERE s.reservation.Id = :id", Services.class)
                .setParameter("id", id)
                .getResultList();
        return res;
    }
}
