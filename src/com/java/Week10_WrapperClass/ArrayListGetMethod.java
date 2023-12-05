package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGetMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple inc");  // I didn't really modify the real String
        list.add("Google.");
        list.add("Amazon.");
        list.add("Microsoft");
        System.out.println(list);

        // get (int index) -> return the element at a given index

        String str = list.get(0);
        System.out.println(str);
        str+=" Company";  // here I just reassigned created new String, string is immutable
        System.out.println(str);
        System.out.println(list);

        String amazon = list.get(2);
        System.out.println(amazon);


        List<Double> numList = new ArrayList<>();
        numList.add(23.12);
        numList.add(34.34);
        numList.add(34.12);
        numList.add(78.92);
        System.out.println(numList);

        Double num = numList.get(2);
        System.out.println(num);


        double num2 = numList.get(3);
        System.out.println(num2);
    }
}
