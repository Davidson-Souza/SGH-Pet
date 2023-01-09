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
            this.database.remove(obj);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void update(Object newObject) {
        var newReservation = (Reservation) newObject;
        this.database.createQuery("UPDATE Reservation c SET c.animal=:animal, c.customer=:customer, c.endDate=:endDate, c.price=:price, c.startDate=:startDate, c.type=:type WHERE id=:id")
                .setParameter("customer", newReservation.getCustomer())
                .setParameter("animal", newReservation.getAnimal())
                .setParameter("endDate", newReservation.getEndDate())
                .setParameter("price", newReservation.getPrice())
                .setParameter("startDate", newReservation.getStartDate())
                .setParameter("type", newReservation.getType())
                .setParameter("id", newReservation.getId());
    }

    public List<Reservation> list() {
        this.database.getTransaction().begin();
        var res = this.database.createQuery("SELECT r FROM Reservation r", Reservation.class)
                .getResultList();
        this.database.getTransaction().commit();
        return res;
    }

}
