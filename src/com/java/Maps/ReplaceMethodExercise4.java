package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class ReplaceMethodExercise4 {
    public static void main(String[] args) {
        Map<String, Double> gradeBook = new HashMap<>(Map.of("Alice", 92.5, "Bob", 88.0, "Carol", 95.75));
        String studentName = "Bob";
        Double newGrade = 90.5;
        System.out.println(addOrUpdateGrade(gradeBook,studentName, newGrade));
    }

    public static Map<String, Double> addOrUpdateGrade(Map<String, Double> gradeBook, String studentName, Double newGrade) {

        if (!gradeBook.containsKey(studentName)) {
            gradeBook.put(studentName, newGrade);
        } else {
            gradeBook.replace(studentName, newGrade);
        }

        return gradeBook;
    }
}
