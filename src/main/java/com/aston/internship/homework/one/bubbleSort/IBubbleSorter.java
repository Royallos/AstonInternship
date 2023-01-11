package com.aston.internship.homework.one.bubbleSort;

/**
 * Parametrized interface by comparable to have possibility compare
 * objects by compareTo method.
 * @param <Type> extends Comparable
 */
public interface IBubbleSorter<Type extends Comparable<Type>> {

    /**
     * Only for tests. Not for commercial use.
     * @return number of iterations. Depends on flag of sort method
     * @see IBubbleSorter#sort(Comparable[], boolean)
     */
    int getIterationsNumber();

    /**
     * Simple bubble sorting. Can be optimized by flag
     * @param array incoming array for sort
     * @param withFlag flag to optimize algorithm
     * @return sorted array
     */
    Type[] sort(Type[] array, boolean withFlag);
}
