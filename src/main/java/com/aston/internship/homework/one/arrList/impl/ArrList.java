package com.aston.internship.homework.one.arrList.impl;

import com.aston.internship.homework.one.arrList.IArrList;

public class ArrList<Type> implements IArrList<Type> {

    private Object[] arr;
    private int capacity = 16;
    private int lastElementPosition = 0;

    public ArrList() {
        arr = new Object[capacity];
    }

    public ArrList(int capacity) {
        this.capacity = capacity;
        arr = new Object[capacity];
    }

    @Override
    public void add(Type element) {
        arr[lastElementPosition] = element;
        lastElementPosition++;
        if (lastElementPosition > capacity * 0.75) {
            capacity *= 1.5;
            Object[] newArr = new Object[capacity];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null) {
                    break;
                }
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    @Override
    public void addAll(IArrList<Type> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == null) {
                return;
            }
            add(list.get(i)) ;
        }
    }

    @Override
    public Type get(int id) {
        return (Type) arr[id];
    }

    @Override
    public void delete(int id) {
        lastElementPosition--;
        Object[] newArr = new Object[arr.length];
        for (int i = 0; i < id; i++) {
            newArr[i] = arr[i];
        }
        for (int i = id + 1; i < arr.length; i++) {
            if (arr[i] == null) {
                return;
            }
            newArr[i] = arr[i];
        }
    }

    @Override
    public int size() {
        return lastElementPosition;
    }

}
