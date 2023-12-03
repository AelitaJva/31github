package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class PutAllMethodExercise3 {
    public static void main(String[] args) {
        Map<String, Double> currentGrades = new HashMap<>(Map.of("Math",85.0, "Science",90.5));
        Map<String, Double> newGrades = new HashMap<>(Map.of("Math",92.5, "History",88.0));

        System.out.println(uploadGrades(currentGrades, newGrades));
    }

    public static Map<String, Double> uploadGrades (Map<String, Double> currentGrades, Map<String, Double> newGrades) {

        currentGrades.putAll(newGrades);
        return currentGrades;
    }
}
