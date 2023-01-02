package com.sghpet.sgh.pet.model;

import javax.persistence.Entity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Servicer extends Employee {

    public void ListAccomodationToClean(Accomodation accomodation) {
        throw new UnsupportedOperationException(
                "Not supported yet.");
    }

}
