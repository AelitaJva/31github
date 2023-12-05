package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSetMethod2 {
    public static void main(String[] args) {

        // set (int index, element); // updates the element at a given index to a new

        List<String> list = new ArrayList<>();

        list.add("Lambo");
        list.add("Ferrari");
        list.add("Bugatti");

        System.out.println(list);

        list.set(1, "Porshe");
        System.out.println(list);

        list.set(2, "GTR");
        System.out.println(list);
    }
}
