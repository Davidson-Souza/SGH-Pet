package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.Reservation;
import com.sghpet.sgh.pet.model.ServicesList;
import com.sghpet.sgh.pet.model.TmReservation;
import com.sghpet.sgh.pet.model.Valid.ValidateReservation;
import com.sghpet.sgh.pet.model.dao.ReservationDAO;
import com.sun.istack.NotNull;
import java.text.ParseException;
import java.util.List;
import javax.swing.JTable;
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

    public void deleteReservation(Reservation reservation) {
        this.repository.delete(reservation);
    }

    public Reservation createReservation(
            Reservation currentReservation,
            Customer curentCustomer,
            List<Animal> curentAnimal,
            int typeOfStay,
            String startDate,
            String endDate,
            Animal animal,
            Customer customer,
            boolean service1,
            boolean service2,
            boolean service3,
            boolean service4
    ) {
        float price = 0;
        ValidateReservation val = new ValidateReservation();
        Reservation reservation;
        try {
            reservation = val.validateReservation(typeOfStay, startDate, endDate, price, animal, customer);
        } catch (ParseException ex) {
            throw new RuntimeException("Erro: Data inválida");
        } catch (RuntimeException e) {
            throw e;
        }
        price += reservation.calcBasePrice();

        if (service1) {
            ServicesController.getServicesController().createService(
                    ServicesList.Shave, 20, reservation, "");
            price += 20;
        }
        if (service2) {
            price += 30;
            ServicesController.getServicesController().createService(
                    ServicesList.Bath, 30, reservation, "");
        }
        if (service3) {
            price += 50;
            ServicesController.getServicesController().createService(
                    ServicesList.Spa, 50, reservation, "");
        }
        if (service4) {
            price += 100;
            ServicesController.getServicesController().createService(
                    ServicesList.Translado, 100, reservation, "");
        }
        // Está editando uma reserva
        if (currentReservation != null) {
            reservation.setId(currentReservation.getId());
            reservation.setPrice(price);
            ReservationController.getReservationController().updateReservation(reservation);
        } else {
            reservation.setPrice(price);
            ReservationController.getReservationController().updateReservation(reservation);
        }

        repository.create(reservation);
        return reservation;
    }

    public static ReservationController getReservationController() {
        return ReservationController.controller;
    }

    public List<Reservation> listReservations() {
        return this.repository.list();
    }

    public static ReservationController getReservationController(ReservationDAO repository) {
        if (ReservationController.controller == null) {
            ReservationController.controller = new ReservationController(repository);
        }
        return ReservationController.controller;
    }

    public void updateReservation(Reservation newRes) {
        this.repository.update(newRes);
    }

    public void updateTable(JTable grdReservation) {
        var TmReservation = new TmReservation(this.listReservations());
        grdReservation.setModel(TmReservation);
    }
}
