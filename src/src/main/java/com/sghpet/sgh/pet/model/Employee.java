package com.sghpet.sgh.pet.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected String name;
    protected String cpf;
    protected int postage;
    protected float sallary;
    protected float weeklyHours;
    // Turno true = diário, false = noturno
    protected boolean turn;
}
