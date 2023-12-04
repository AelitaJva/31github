package com.java.Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAndListExercise3 {
    public static void main(String[] args) {
        // Example usage:
        Map<String, List<Double>> gradeBook = new HashMap<>();
        gradeBook.put("Alice", Arrays.asList(90.0, 85.0, 92.0, 88.0, 76.0));
        gradeBook.put("Charlie", Arrays.asList(95.0, 89.0, 94.0, 88.0, 91.0));
        gradeBook.put("Bob", Arrays.asList(78.0, 88.0, 92.0, 70.0, 84.0));

        calculateAndDisplayAverageGrades(gradeBook);
    }

    public static void calculateAndDisplayAverageGrades(Map<String, List<Double>> gradeBook) {
        // Iterate through each student in the gradeBook
        for (Map.Entry<String, List<Double>> entry : gradeBook.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            // Calculate the average grade for the student
            double averageGrade = calculateAverage(grades);

            // Display the result
            System.out.printf("%s - %.1f%n", studentName, averageGrade);
        }
    }

    private static double calculateAverage(List<Double> grades) {
        // Check if the list is not empty to avoid division by zero
        if (grades.isEmpty()) {
            return 0.0;
        }

        // Calculate the sum of grades
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }

        // Calculate the average
        return sum / grades.size();
    }
}
