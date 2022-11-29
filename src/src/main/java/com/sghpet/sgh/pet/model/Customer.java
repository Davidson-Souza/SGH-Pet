package com.sghpet.sgh.pet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;
    private String cpf;
    private String name;
    private String address;
    private String PhoneNumber;
}
