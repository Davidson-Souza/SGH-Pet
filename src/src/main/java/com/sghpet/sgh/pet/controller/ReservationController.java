package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.Reservation;
import com.sghpet.sgh.pet.model.dao.ReservationDAO;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ReservationController {

    @NotNull
    private ReservationDAO repository;
    private static ReservationController controller;

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
