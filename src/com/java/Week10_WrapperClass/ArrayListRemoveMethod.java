package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveMethod {
    public static void main(String[] args) {

        List<Double> numList = new ArrayList<>();
        numList.add(21.33);
        numList.add(45.67);
        numList.add(34.98);
        numList.add(39.98);
        System.out.println(numList);
        numList.remove(2);
        System.out.println(numList);
    }
}
