package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class ClearMethod {
    public static void main(String[] args) {
        // clear the map
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriquez");
        students.put(4, "Julia Lopez");

        System.out.println(students);

        students.clear();
        System.out.println(students);
    }
}
