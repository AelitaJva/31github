package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapRemoveMethod {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriquez");
        students.put(4, "Julia Lopez");

        String removedValue = students.remove(2);
        System.out.println("Removed value: " + removedValue);
        System.out.println(students);


        // removing a key that doesn't exist in the map return null
        System.out.println(students.remove(11));
        System.out.println(students);

    }
}
