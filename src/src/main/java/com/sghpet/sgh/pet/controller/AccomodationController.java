package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Accomodation;
import com.sghpet.sgh.pet.model.TmAccomodations;
import com.sghpet.sgh.pet.model.dao.AccomodationDAO;
import com.sun.istack.NotNull;
import java.util.List;
import javax.swing.JTable;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
public class AccomodationController {

    private static AccomodationController controller;
    @NotNull
    private AccomodationDAO repository;

    public static AccomodationController getAccomodationController() {
        return AccomodationController.controller;
    }

    public static AccomodationController getAccomodationController(AccomodationDAO repository) {
        if (AccomodationController.controller == null) {
            AccomodationController.controller = new AccomodationController(repository);
        }
        return AccomodationController.controller;
    }

    private List<Accomodation> listAccomodations() {
        return this.repository.list();
    }
    public void updateTable(JTable grdAccomodation) {
        var TmAccomodation = new TmAccomodations(this.listAccomodations());
        grdAccomodation.setModel(TmAccomodation);
    }
}
