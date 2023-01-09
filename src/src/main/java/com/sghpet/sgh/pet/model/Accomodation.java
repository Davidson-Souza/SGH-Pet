package com.sghpet.sgh.pet.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Data
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
public class Accomodation implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int Id;
    @NotNull
    private float accomodationSize;
    @NotNull
    private int capacity;
    @NotNull
    @NonNull
    private float size;
    @NonNull
    private int vacant;
}
