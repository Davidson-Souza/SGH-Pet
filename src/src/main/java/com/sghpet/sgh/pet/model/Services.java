package com.sghpet.sgh.pet.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Services implements Serializable {

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private int id;
    @NotNull
    private ServicesList serviceType;
    @NotNull
    private float price;
    @ManyToOne(cascade = CascadeType.ALL)
    @NotNull
    private Reservation reservation;
    @NotNull
    private String description;
}
