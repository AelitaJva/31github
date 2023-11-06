package com.java.Arrays;

public class EExercise3 {
    public static double calculateAverageGrade (double[] grades) {
        double sum = 0.0;
        for(double grade : grades) {
            sum+=grade;
        }
        return sum / grades.length;
    }

    public static double maxGrade (double[] grades) {
        double highest = grades[0];

        for(int i=0; i<grades.length; i++) {
            if(highest < grades[i]) {
                highest = grades[i];
            }
        }
        return highest;
    }

    public static double minGrade (double[] grades) {
        double lowest = grades[0];

        for(double grade : grades) {
            if(lowest > grade) {
                lowest = grade;
            }
        }
        return lowest;
    }

    public static String findTopScorer (String[] names, double[] grades, double maxGrade) {
        for(int i=0; i<grades.length; i++) {
            if(grades[i] == maxGrade) {
                return names[i];
            }
        }
        return "No top scorer found";
    }

    public static String findLowestScorer (String[] names, double[] grades, double minGrade) {
        for(int i=0; i<grades.length; i++) {
            if(grades[i] == minGrade) {
                return names[i];
            }
        }
        return "No lowest scorer found";
    }

    public static void analyzeStudentGrades(String[] names, double[] grades) {
        if (names.length != grades.length || names.length == 0) {
            System.out.println("Invalid input.");
            return;
        }

        double averageGrade = calculateAverageGrade(grades);
        double highestGrade = maxGrade(grades);
        double lowestGrade = minGrade(grades);
        String topScorer = findTopScorer(names, grades, highestGrade);
        String lowestScorer = findLowestScorer(names, grades, lowestGrade);

        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);
        System.out.println("Top Scorer: " + topScorer);
        System.out.println("Lowest Scorer: " + lowestScorer);
    }

    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        double[] grades = {92.5, 88.0, 95.5, 79.0};
        analyzeStudentGrades(names, grades);
    }

}


