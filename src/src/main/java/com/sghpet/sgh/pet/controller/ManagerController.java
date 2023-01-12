package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Payment;
import com.sghpet.sgh.pet.view.FrManagerFunction;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;

public class ManagerController {

    public static float getReport(Date startPeriod, Date endDate) throws IOException {
        var payments = PaymentController.getPaymentController().listPayments();
        List<Payment> inPeriod = new LinkedList();
        try {
            for (var payment : payments) {
                System.out.println(payment.getPaymentDate());
                if (payment.getPaymentDate().after(startPeriod)
                        && payment.getPaymentDate().before(endDate)) {
                    inPeriod.add(payment);
                }
            }
        } catch (RuntimeException e) {
            System.out.println(e);
            throw e;
        }
        var total = 0;
        var csv = Payment.getCSVModel() + "\n";
        for (var payment : inPeriod) {
            csv += payment.toCSV() + "\n";
            total += payment.getPrice();
        }

        FileWriter fWriter;
        try {
            fWriter = new FileWriter("report.csv");
            fWriter.write(csv);
            fWriter.close();
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(FrManagerFunction.class.getName()).log(Level.SEVERE, null, ex);
            throw ex;
        }
        return total;
    }
}
