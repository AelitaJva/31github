package com.java.Arrays;

public class CExercise3 {

    public static void displayGrades (String[] names, double[] grades) {
        if(names.length != grades.length) {
            System.out.println("The length of the names and grades must be equal!");
            return;
        }

        for(int i=0; i< names.length; i++) {
            String name = names[i];
            double grade = grades[i];
            String formattedGrade = String.format("%.1f", grade);
            System.out.println((i+1) + ". " + name + " - " + grade);
        }
    }

    public static void main(String[] args) {
        String[] names = {"John", "Alice", "Bob"};
        double[] grades = {85.5, 92.0, 78.5};

        displayGrades(names, grades);
    }
}
