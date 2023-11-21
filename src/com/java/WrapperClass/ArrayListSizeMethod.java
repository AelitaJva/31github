package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSizeMethod {
    public static void main(String[] args) {

        List<Double> numList = new ArrayList<>();
        numList.add(23.12);
        numList.add(34.34);
        numList.add(34.12);
        numList.add(78.92);

        // size() => return an int which the size of the list.
        // this is same as array.length property


        int sizeOfList = numList.size();
        System.out.println(sizeOfList);

    }
}
