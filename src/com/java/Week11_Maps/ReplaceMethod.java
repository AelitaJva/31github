package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class ReplaceMethod {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriguez");
        students.put(4, "Julia Lopez");

        // replace(key, value); and returns the old value
        String odlValue = students.replace(2, "Sam Altman");

        System.out.println("Replaced old value: " + odlValue);
        System.out.println(students);

        String oldVal = students.replace(5, "Bill Gates");
        System.out.println(oldVal);
        System.out.println(students);
    }
}
