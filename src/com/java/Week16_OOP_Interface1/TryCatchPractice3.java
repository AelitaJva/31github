package com.java.Week16_OOP_Interface1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPractice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter a number:");
            double number = scanner.nextDouble();
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid number");
        }
    }

}
