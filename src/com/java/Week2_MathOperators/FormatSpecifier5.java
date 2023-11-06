package com.java.Week2_MathOperators;

public class FormatSpecifier5 {
    public static void main(String[] args) {
        // %f

        double salary = 175000.1345;
        System.out.printf("%f", salary);

        System.out.printf("\n%.2f", salary);
        System.out.printf("\n%,.2f", salary);
    }
}
