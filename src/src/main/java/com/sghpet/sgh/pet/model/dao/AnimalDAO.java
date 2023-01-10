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

    private EntityManager database;

    public void create() {

    }

    @Override
    public void create(Object obj) {
        Animal newAnimal = (Animal) obj;
        try {
            database.getTransaction().begin();
            database.persist(newAnimal);
            database.getTransaction().commit();
        } catch (RuntimeErrorException e) {
            throw e;
        }
    }

    @Override
    public Animal get(int id) {
        return database.find(Animal.class, id);
    }

    @Override
    public Object find(Object uniqueKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Object obj) {
        try {
            database.getTransaction().begin();
            database.remove(obj);
            database.getTransaction().commit();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void update(Object newAnimal) {
        database.merge(newAnimal);
    }

    public List<Animal> listAnimalsByUser(int id) {
        var res = this.database.createQuery("SELECT a FROM Animal a WHERE a.owner.Id = :id", Animal.class)
                .setParameter("id", id)
                .getResultList();
        return res;
    }

    public List<Animal> list() {
        var res = this.database.createQuery("SELECT a FROM Animal a", Animal.class)
                .getResultList();
        return res;
    }

}
