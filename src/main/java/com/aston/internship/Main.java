package com.aston.internship;

import com.aston.internship.homework.one.arrList.IArrList;
import com.aston.internship.homework.one.arrList.impl.ArrList;

public class Main {
    public static void main(String[] args) {
        IArrList<String> stringIArrList = new ArrList<>(5);
        stringIArrList.add("1");
        stringIArrList.add("2");
        stringIArrList.add("3");

        System.out.println(stringIArrList.get(0));
        System.out.println(stringIArrList.get(2));
        System.out.println(stringIArrList.get(1));
    }
}
