package com.sghpet.sgh.pet.controller;

import com.sghpet.sgh.pet.model.Animal;
import com.sghpet.sgh.pet.model.Customer;
import com.sghpet.sgh.pet.model.TmAnimal;
import com.sghpet.sgh.pet.model.Valid.ValidateAnimal;
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
     * Get animal giving it's id. This function might throw an exception if the
     * database isn't working.
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

    public void createAnimal(Animal curentAnimal, String name, String ownerCPF, String type, String postage, boolean hasMedicalCondition) {
        Customer owner;
        try {
            owner = CustomerController.getCustomerController().findCustomerByCPF(ownerCPF);
        } catch (RuntimeException e) {
            throw new RuntimeException("Não foi possível encontra o usuário");
        }

        ValidateAnimal val = new ValidateAnimal();
        try {
            if (curentAnimal != null) {
                var newAnimal = val.validateAnimal(name, owner, type, postage, hasMedicalCondition);
                newAnimal.setId(curentAnimal.getId());
                this.updateAnimal(newAnimal);
            } else {
                Animal newAnimal = val.validateAnimal(name, owner, type, postage, hasMedicalCondition);

                this.repository.create(newAnimal);
            }
        } catch (RuntimeException e) {
            throw e;
        }
    }

    public void updateAnimal(Object newAnimal) {
        this.repository.update(newAnimal);
    }

    public void updateTable(JTable grdAnimal) {
        TmAnimal tmAnimal = new TmAnimal(this.listAnimals());
        grdAnimal.setModel(tmAnimal);
    }

    public void deleteAnimal(Object objt) {
        repository.delete(objt);
    }
}
