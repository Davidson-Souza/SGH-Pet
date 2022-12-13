package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Reservation;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReservationController {

    private EntityManager repository;

    public void createReservation(int typeOfStay, String startDate, String endDate) {
        var reservation = new Reservation(startDate, endDate, typeOfStay, 0);
        this.repository.getTransaction().begin();
        this.repository.persist(reservation);
        this.repository.getTransaction().commit();
    }
}
