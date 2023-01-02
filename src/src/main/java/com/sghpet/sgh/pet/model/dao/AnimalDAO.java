package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Animal;
import java.util.List;
import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalDAO implements Persistence {

    private EntityManager animalStore;

    public void create() {

    }

    @Override
    public void create(Object obj) {
        try {
            animalStore.getTransaction().begin();
            animalStore.persist((Animal) obj);
            animalStore.getTransaction().commit();
        } catch (RuntimeErrorException e) {
            throw e;
        }
    }

    @Override
    public Object get(int id) {
        return animalStore.find(Animal.class, id);
    }

    @Override
    public Object find(Object uniqueKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Object obj) {
        try {
            this.animalStore.remove(obj);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void update(Object newObject) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Animal> listAnimalsByUser(int id) {
        var res = this.animalStore.createQuery("SELECT a FROM Animal a WHERE a.owner.Id LIKE :id", Animal.class)
                .setParameter("cpf", id)
                .getResultList();
        return res;
    }
}
