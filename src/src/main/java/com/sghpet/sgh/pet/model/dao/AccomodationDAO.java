package com.sghpet.sgh.pet.model.dao;

import com.sghpet.sgh.pet.model.Accomodation;
import com.sghpet.sgh.pet.model.Animal;
import java.util.List;
import javax.management.RuntimeErrorException;
import javax.persistence.EntityManager;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AccomodationDAO implements Persistence {

    private EntityManager database;

    public void create() {

    }

    @Override
    public void create(Object obj) {
        try {
            database.getTransaction().begin();
            database.persist((Accomodation) obj);
            database.getTransaction().commit();
        } catch (RuntimeErrorException e) {
            throw e;
        }
    }

    @Override
    public Object get(int id) {
        return database.find(Animal.class, id);
    }

    @Override
    public Object find(Object uniqueKey) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Object obj) {
        try {
            this.database.remove(obj);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public void update(Object newObject) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Accomodation> listAnimalsByUser(int id) {
        var res = this.database.createQuery("SELECT a FROM Animal a WHERE a.owner.Id = :id", Accomodation.class)
                .setParameter("id", id)
                .getResultList();
        return res;
    }

    public List<Accomodation> list() {
        var res = this.database.createQuery("SELECT a FROM Animal a", Accomodation.class)
                .getResultList();
        return res;
    }

}
