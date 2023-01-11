package com.aston.internship.homework.one.arrList;

/**
 * Minimized version of ArrayList
 * @param <Type> type of list objects
 * @see java.util.ArrayList
 */
public interface IArrList<Type> {

    /**
     * Add new element into array
     * @param element element with specified type
     */
    void add(Type element);

    /**
     * Get new element from array by id
     * @param id element position in array
     * @return parametrized element of array by id
     */
    Type get(int id);

    /**
     * Delete element from array by id
     * @param id element position in array
     */
    void delete(int id);

    /**
     * Get number of elements in array
     * @return number of elements in array
     */
    int size();

    /**
     * Add elements of incoming array into this
     * @param list incoming array
     */
    void addAll(IArrList<Type> list);

}
