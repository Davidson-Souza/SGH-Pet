package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Reservation;
import com.sghpet.sgh.pet.view.FrClerkFunction;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

public class ClerkController {
    public static void getReport(Date startPeriod, Date endDate) throws IOException, ParseException {
        var reservations = ReservationController.getReservationController().listReservations();
        List<Reservation> inPeriod = new LinkedList();
        try {
            for (var reservation : reservations) {
                var formarterDate = new SimpleDateFormat("dd/MM/yyyy").parse(reservation.getStartDate());
                if (formarterDate.after(startPeriod)
                        && formarterDate.before(endDate)) {
                    inPeriod.add(reservation);
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e);
            throw e;
        }
        var json = "[\n";
        for (var reservation : inPeriod) {
            json += reservation.toJSON()+ "\n";
        }
        json +="]";

        FileWriter fWriter;
        try {
            fWriter = new FileWriter("reservationReport.json");
            fWriter.write(json);
            fWriter.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FrClerkFunction.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
    }
}
