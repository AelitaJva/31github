package com.java.Week3_InputFromUser;

import java.util.Scanner;

public class ScannerNextDouble {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your desired salary?");
        double salary = sc.nextDouble();
        System.out.println("Your desired salary is " + salary);

        System.out.println("What is the conversion rate from USD to GBP?");
        double usdToGPT = sc.nextDouble();
        System.out.println("USD to GBP rate: " + usdToGPT);

        System.out.println("What is your years of experience in IT?");
        int yearsOfEx = sc.nextInt();
        System.out.printf("I have %d years of experience in Tech", yearsOfEx);

        System.out.println("\nWhich company do you want to work for?");
        sc.nextLine();
        String company = sc.nextLine();
        System.out.printf("I want to work for %s", company);
    }
}
