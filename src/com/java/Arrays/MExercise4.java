package com.java.Arrays;

public class MExercise4 {
    public static void main(String[] args) {
        double[] grades = {90.0, 85.5, 88.2, 92.7};
        System.out.println(calculateAverageGrade(grades));
    }

    public static double calculateAverageGrade(double[] grades) {

        double totalSum = 0.0;
        double averageGrade = 0.0;

        for (double grade : grades) {
            totalSum += grade;
        }
        averageGrade = totalSum / grades.length;

        return averageGrade;
    }
}
