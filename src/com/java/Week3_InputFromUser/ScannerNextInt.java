package com.java.Week3_InputFromUser;

import java.util.Scanner;

public class ScannerNextInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("How many cars do you have?");
        int cars = sc.nextInt();
        System.out.println("I have " + cars);


        // whenever you are using anything besides nextLine(); before using NextLine();
        // you have to eat the last line that methods like next();, nextInt(); leave after themselves
        sc.nextLine();

        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.printf("My name is: %s, I'm %d years old, I have %d cars", name, age, cars);

    }
}
