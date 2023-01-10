package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Reservation;
import java.util.List;
import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ReservationDAO implements Persistence {

    private EntityManager database;

    @Override
    public void create(Object obj) {
        try {
            database.getTransaction().begin();
            database.persist((Reservation) obj);
            database.getTransaction().commit();
        } catch (RuntimeErrorException e) {
            throw e;
        }
    }

    @Override
    public Object get(int id) {
        return database.find(Reservation.class, id);
    }

    @Override
    public Object find(Object uniqueKey) {
        throw new UnsupportedOperationException("This method is not implemented for Reservation, use get instead");
    }

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

    @Override
    public void update(Object newObject) {
        database.merge(newObject);
    }

    public List<Reservation> list() {
        this.database.getTransaction().begin();
        var res = this.database.createQuery("SELECT r FROM Reservation r", Reservation.class)
                .getResultList();
        this.database.getTransaction().commit();
        return res;
    }

}
