package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Payment;
import com.sghpet.sgh.pet.model.PaymentMethods;
import com.sghpet.sgh.pet.model.Reservation;
import com.sghpet.sgh.pet.model.TmPayment;
import com.sghpet.sgh.pet.model.dao.PaymentDAO;
import com.sun.istack.NotNull;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
public class PaymentController {

    private static PaymentController controller;
    @NotNull
    private PaymentDAO dao;

    public static PaymentController getPaymentController() {
        return PaymentController.controller;
    }

    public static PaymentController getPaymentController(PaymentDAO dao) {
        if (PaymentController.controller == null) {
            PaymentController.controller = new PaymentController(dao);
        }
        return PaymentController.controller;
    }

    public List<Payment> listPayments() {
        return this.dao.list();
    }

    public Payment createPayment(Reservation reservation, PaymentMethods method, int parts) {
        var price = reservation.getPrice();
        var pay = new Payment(reservation, price, method, parts, (Date) new Date());
        this.dao.create(pay);
        return pay;
    }
    public void updateTable(JTable grdPayment) {
        var TmPayment = new TmPayment(this.listPayments());
        grdPayment.setModel(TmPayment);
    }
    
}
