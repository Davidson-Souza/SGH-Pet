package com.sghpet.sgh.pet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String name;
    private Customer owner;
    private int type;
    private int postage;
    private boolean hasMedicalCondition;
    private Accomodation placeOfStay;
    private int lastBathTime;
}
