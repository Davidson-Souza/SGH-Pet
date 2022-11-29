package com.sghpet.sgh.pet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Accomodation {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;
    private float size;
    private int capacity;
    private int vacant;
}
