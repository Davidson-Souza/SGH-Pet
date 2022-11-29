package com.sghpet.sgh.pet.model;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;
    private Date startDate;
    private Date endDate;
    private int type;
    private float price;
    // TODO
    private List<String> services;

}
