package com.sghpet.sgh.pet.model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class Animal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @NonNull
    private String name;
    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer owner;
    @NonNull
    private int type;
    @NonNull
    private int postage;
    @NonNull
    private boolean hasMedicalCondition;
    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "place_of_stay_id")
    private Accomodation placeOfStay;
    @NonNull
    private int lastBathTime;

    public void fromFields(String name, Customer owner, String type, String postage, boolean hasMedicalCondition) {
        int animal_type = -1;
        int animal_postage = -1;
        switch (type) {
            case "Cachorro":
                animal_type = 0;
                break;
            case "Gato":
                animal_type = 1;
                break;
            default:
                throw new AssertionError();
        }
        switch (postage) {
            case "Pequeno":
                animal_postage = 0;
                break;
            case "Medio":
                animal_postage = 1;
                break;
            case "Grande":
                animal_postage = 2;
                break;
            default:
                throw new AssertionError();
        }
        this.name = name;
        this.owner = owner;
        this.type = animal_type;
        this.postage = animal_postage;
        this.hasMedicalCondition = hasMedicalCondition;
        this.placeOfStay = new Accomodation();
        this.lastBathTime = 0;
    }
}
