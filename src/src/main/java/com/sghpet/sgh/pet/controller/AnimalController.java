package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.TmAnimal;
import com.sghpet.sgh.pet.model.dao.AnimalDAO;
import java.util.List;
import javax.swing.JTable;

public class AnimalController {

    protected AnimalDAO repository;
    private static AnimalController contr;

    private AnimalController(AnimalDAO manager) {
        this.repository = manager;
    }

    public List<Animal> listAnimals() {
        return this.repository.list();
    }

    public static AnimalController getAnimalController(AnimalDAO manager) {
        if (getAnimalController() == null) {
            AnimalController.contr = new AnimalController(manager);
        }
        return getAnimalController();
    }

    public static AnimalController getAnimalController() {
        return AnimalController.contr;
    }
    
    /**
     * Get animal giving it's id.
     * This function might throw an exception if the database isn't working.
     *
     * @param id: integer, A user id
     * @return Animal
     */
    public Animal getAnimal(int id) throws RuntimeException {
        return this.repository.get(id);
    }

    public List<Animal> listAnimalByCustomer(int id) {
        return repository.listAnimalsByUser(id);
    }

    public void createAnimal(String name, Customer owner, String type, String postage, boolean hasMedicalCondition) {
        Animal newAnimal = new Animal(name, owner, type, postage, hasMedicalCondition);

        this.repository.create(newAnimal);
    }
    
    public void updateAnimal(Object newAnimal) {
        this.repository.update(newAnimal);
    }
    
    public void updateTable(JTable grdAnimal){
        TmAnimal tmAnimal = new TmAnimal(this.listAnimals());
        grdAnimal.setModel(tmAnimal);
    }

    public void deleteAnimal(Object objt) {
        repository.delete(objt);
    }
}
