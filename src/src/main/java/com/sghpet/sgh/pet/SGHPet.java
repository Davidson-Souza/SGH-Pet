package com.sghpet.sgh.pet;

import com.sghpet.sgh.pet.view.FrMainMenu;


public class SGHPet {

    public static void main(String[] args) {
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager manager = fac.createEntityManager();

        FrMainMenu menu = new FrMainMenu();
        menu.show();
    }
}
