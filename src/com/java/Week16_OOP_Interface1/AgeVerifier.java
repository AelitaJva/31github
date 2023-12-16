package com.java.Week16_OOP_Interface1;

import java.util.Scanner;

public class AgeVerifier {
    public static void main(String[] args) {
        AgeVerifier ageVerifier = new AgeVerifier();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        try {
            ageVerifier.verifyAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void verifyAge(int age) throws IllegalArgumentException {

        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        } else {
            System.out.println("Age verification successful");
        }

    }
}
