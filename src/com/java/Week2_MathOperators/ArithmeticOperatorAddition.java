package com.java.Week2_MathOperators;

public class ArithmeticOperatorAddition {
    public static void main(String[] args) {
        int test1Score = 67;
        int test2Score = 70;
        int test3Score = 60;

        int totalScore = test1Score + test2Score + test3Score;
        System.out.println(totalScore);

        // concatenation with the string and integer is not possible.
        System.out.println("Hello" + test1Score + test2Score);

        System.out.println("========== Exercise 1 ==========");
        double revenue2021 = 1462000000.0;
        double revenue2022 = 1462000000.0;
        double totalRevenueForLast2Years = revenue2021 + revenue2022;

        System.out.println(totalRevenueForLast2Years);

    }
}
