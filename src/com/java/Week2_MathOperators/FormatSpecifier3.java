package com.java.Week2_MathOperators;

public class FormatSpecifier3 {
    public static void main(String[] args) {
        // %c - format specifier for a character

        char grade  = 'A';
        System.out.printf("Your grade for the last exam: %c", grade);

        char gender = 'F';
        System.out.printf("\nUser's gender: %c", gender);

        String name = "Minnie Mouse";
        System.out.printf("Name: (%s), Gender: %c, exam grade: %c", name, gender, grade);
    }
}
