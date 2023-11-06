package com.java.Week3_InputFromUser;

import java.util.Scanner;

public class ScannerBoolean {
    public static void main(String[] args) {

        Scanner sc  = new Scanner (System.in);
        System.out.println("type true if satisfied or false if not satisfies?");
        boolean isSatisfied = sc.nextBoolean();
        System.out.println("Is customer satisfied? " + isSatisfied);

        System.out.println("reset iPhone to default settings?");
        boolean reset = sc.nextBoolean();
        System.out.println("iPhone is reset to default settings " + reset);
    }
}
