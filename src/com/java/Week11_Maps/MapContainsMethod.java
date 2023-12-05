package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapContainsMethod {
    public static void main(String[] args) {
        // to avoid null returns first check that element exists or not

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Elon Musk");
        students.put(2, "Steve Jobs");
        students.put(121, "Stacy Rodriquez");
        students.put(4, "Julia Lopez");

        if(students.containsKey(4)){
            System.out.println("Contains key 4");
            System.out.println(students.get(4));

        }
    }
}
