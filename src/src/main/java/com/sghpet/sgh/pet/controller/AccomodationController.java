package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Accomodation;
import com.sghpet.sgh.pet.model.dao.AccomodationDAO;
import com.sun.istack.NotNull;
import java.util.List;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
public class AccomodationController {

    private static AccomodationController controller;
    @NotNull
    private AccomodationDAO repository;

    private static AccomodationController getAccomodationController() {
        return AccomodationController.controller;
    }

    private static AccomodationController getAccomodationController(AccomodationDAO repository) {
        if (AccomodationController.controller == null) {
            AccomodationController.controller = new AccomodationController(repository);
        }
        return AccomodationController.controller;
    }

    private List<Accomodation> listAccomodations() {
        return this.repository.list();
    }
}
