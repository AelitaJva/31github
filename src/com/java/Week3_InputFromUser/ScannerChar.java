package com.java.Week3_InputFromUser;

import java.util.Scanner;

public class ScannerChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your grade for the exam?");
        char grade = sc.nextLine().charAt(0);
        System.out.println("Your grade is: " + grade);

        System.out.println("What is your gender?");
        char gender = sc.nextLine().charAt(0);
        System.out.println("Gender: " + gender);
    }
}
