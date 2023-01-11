package com.sghpet.sgh.pet.model.Valid;

import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.Reservation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidateReservation {

    public Reservation validateReservation(int typeOfStay,
            String startDate,
            String endDate,
            float price,
            Animal animal,
            Customer customer) throws ParseException {
        var formarter = new SimpleDateFormat("dd/MM/yyyy");

        var parsedStartDate = formarter.parse(startDate);
        var parsedEndDate = formarter.parse(startDate);

        if (parsedStartDate.before(new Date())) {
            throw new RuntimeException("Erro: Data deve ser no futuro, não no passado");
        }
        if (parsedEndDate.before(parsedStartDate)) {
            throw new RuntimeException("Erro: Data de término não pode ser antes do começo");
        }

        return new Reservation(startDate, endDate, typeOfStay, price, animal, customer);
    }
}
