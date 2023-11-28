package com.java.Maps;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PutMethod {
    public static void main(String[] args) {
        // list and set use brackets
        // map uses a curly braces

        // key -> id of the student
        // value -> name of teh student, name can be duplicated


        // 1. put -> adds a new key value pair.
        // 2. put -> if the key already exists then put will update the value of key

        // no gargantuan to be ordered
        // adding a new key value pair
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(100, "Elon Musk");
        students.put(4, "Michele");
        System.out.println(students);

        // updating the value of key 1
        students.put(1, "Aelita");
        System.out.println(students);

        // Key -> ssn as a String
        // Value -> income reported

        Map<String, Double> reportedIncome = new HashMap<>();
        reportedIncome.put("112-444-0000", 10000.00);
        reportedIncome.put("232-444-1111", 10000.00);
        reportedIncome.put("445-444-5555", 10000.00);
        System.out.println(reportedIncome);






    }
}
