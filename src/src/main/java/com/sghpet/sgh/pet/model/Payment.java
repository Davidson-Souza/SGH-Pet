package com.sghpet.sgh.pet.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @NotNull
    @OneToOne
    private Reservation reservation;
    @NotNull
    private float price;
    @NotNull
    private PaymentMethods method;
    @NotNull
    private int parts;
    @NotNull
    private Date paymentDate;

    public String toCSV() {
        var csv = "" + this.getId() + "," + this.getMethod() + "," + this.getParts() + "," + this.getPaymentDate() + "," + this.getReservation().getId();
        return csv;
    }

    public static String getCSVModel() {
        return "id,method,parts,date,reservation";
    }
}
