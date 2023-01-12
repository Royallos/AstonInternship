package com.aston.internship.homework.one.bubbleSort.impl;

import com.aston.internship.homework.one.bubbleSort.IBubbleSorter;

public class BubbleSorter<Type extends Comparable<Type>> implements IBubbleSorter<Type> {

    private int iterationsNumber = 0;

    @Override
    public int getIterationsNumber() {
        return iterationsNumber;
    }

    @Override
    public Type[] sort(Type[] array, boolean withFlag) {
        Type temp;
        boolean isArrayChanged;

        for (int i = 0; i < array.length; i++) {
            isArrayChanged = !withFlag;
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1].compareTo(array[j]) > 0) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isArrayChanged = true;
                }
            }
            if (!isArrayChanged) {
                return array;
            }
            iterationsNumber++;
        }
        return array;
    }
}
