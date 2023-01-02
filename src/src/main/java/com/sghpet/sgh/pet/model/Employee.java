package com.sghpet.sgh.pet.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected int id;
    @NonNull
    protected String name;
    @NonNull
    protected String cpf;
    @NonNull
    protected float sallary;
    @NonNull
    protected float weeklyHours;
    // Turno true = diário, false = noturno
    @NonNull
    protected boolean turn;
    @NonNull
    protected String password;
    @NonNull
    protected int job;
}
