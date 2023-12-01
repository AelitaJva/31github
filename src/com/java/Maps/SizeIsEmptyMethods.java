package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class SizeIsEmptyMethods {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();

        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriguez");
        students.put(4, "Julia Lopez");

        System.out.println(students.size());

        // isEmpty(); method -> returns true if the map has no entries,
        // false if there is at least one entry

        System.out.println(students.isEmpty());

        if(!students.isEmpty()) {

        }


    }
}
