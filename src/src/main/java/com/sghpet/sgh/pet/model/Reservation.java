package com.sghpet.sgh.pet.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor

public class Reservation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;
    @NonNull
    private String startDate;
    @NonNull
    private String endDate;
    @NonNull
    private int type;
    @NonNull
    private float price;
    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Animal animal;
    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public float calcBasePrice() {
        var formarter = new SimpleDateFormat("dd/MM/yyyy");
        Date _startDate = null, _endDate = null;

        try {
            _startDate = formarter.parse(this.startDate);
            _endDate = formarter.parse(this.endDate);
        } catch (RuntimeException e) {
            throw e;
        } catch (ParseException ex) {
            Logger.getLogger(Reservation.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (_startDate == null || _endDate == null) {
            return 0;
        }
        var diff = (_endDate.getTime() - _startDate.getTime()) / (1000 * 60 * 60 * 24);
        return diff * 10;
    }
}
