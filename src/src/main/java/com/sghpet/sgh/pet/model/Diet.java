package com.sghpet.sgh.pet.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Diet implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;
    private int TypeOfDiet;
    private int Quantity;
    private float Price;

    public Diet() {
    }

    public Diet(int id, int type, int quantity, float price) {
        this.Id = id;
        this.Quantity = quantity;
        this.TypeOfDiet = type;
        this.Price = price;
    }
}
