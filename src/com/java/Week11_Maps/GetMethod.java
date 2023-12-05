package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class GetMethod {
    public static void main(String[] args) {

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriquez");
        students.put(4, "Julia Lopez");

        // get method takes in the key value
        // return type of get is dynamic
        // it returns the data type which was set in the initialization
        // for the values.

        String name1 = students.get(1);
        System.out.println(name1);
        System.out.println(students.get(121));

        System.out.println(students.get(5));  // return null, if the key doesn't exist

        Map<String, Double> reportedIncome = new HashMap<>();
        reportedIncome.put("112-444-555", 10000.00);
        reportedIncome.put("112-444-555", 10000.00);
        reportedIncome.put("112-444-555", 10000.00);
    }
}
