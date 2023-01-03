package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.Reservation;
import com.sghpet.sgh.pet.model.dao.ReservationDAO;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class ReservationController {

    @NotNull
    private ReservationDAO repository;
    private static ReservationController controller;

    public Reservation getReservation(int id) {
        return (Reservation) this.repository.get(id);
    }

    public void deleteReservation(int id) {
        this.repository.delete(id);
    }

    public void createReservation(int typeOfStay, String startDate, String endDate, float price, Animal animal, Customer customer) {
        var reservation = new Reservation(startDate, endDate, typeOfStay, price, animal, customer);
        repository.create(reservation);
    }

    public static ReservationController getReservationController() {
        return ReservationController.controller;
    }

    public static ReservationController getReservationController(ReservationDAO repository) {
        if (ReservationController.controller == null) {
            ReservationController.controller = new ReservationController(repository);
        }
        return ReservationController.controller;
    }
}
