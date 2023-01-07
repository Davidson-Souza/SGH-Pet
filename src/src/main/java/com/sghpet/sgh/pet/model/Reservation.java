package com.sghpet.sgh.pet.model;

import java.io.Serializable;
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
@AllArgsConstructor
@NoArgsConstructor
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
}
