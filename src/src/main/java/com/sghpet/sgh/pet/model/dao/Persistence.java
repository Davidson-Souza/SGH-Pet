package com.sghpet.sgh.pet.model.dao;

/**
 * This interface should be implemented by all DAO classes
 */
public interface Persistence {

    /**
     * Creates a new element ann persists it in the database
     *
     * @param obj: What should be persisted
     */
    public void create(Object obj);

    /**
     * Return the object with a given id
     *
     * @param id: An object id
     * @return The object with this given id
     */
    public Object get(int id);

    /**
     * Finds the object with this given value. This method is useful in cases of
     * unique values, like cpf. It only returns at most one element.
     *
     * @param uniqueKey: This is an object-specific key for searching. Like CPF
     * for Customer
     * @return The object with this given id
     */
    public Object find(Object uniqueKey);

    /**
     * Return the object with a given id
     *
     * @param obj: The object
     */
    public void delete(Object obj);

    /**
     * Return the object with a given id
     *
     * @param newObject: The new values for this object
     */
    public void update(Object newObject);
}
