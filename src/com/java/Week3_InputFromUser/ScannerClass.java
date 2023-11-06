package com.java.Week3_InputFromUser;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String name = input.next();
        String lastName = input.nextLine();
        String address = input.nextLine();
        String companie1 = input.nextLine();


        //System.out.printf("Welcome %s and %s", name, lastName);
        System.out.println("Welcome " + lastName);
        System.out.println("Your address is: " + address);
        System.out.println("CEO of " + companie1);
    }
}
