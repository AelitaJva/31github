package com.java.Week2_MathOperators;

public class ArithmetichOperatorsModule {
    public static void main(String[] args) {
        System.out.println("========== Exercise 1 ==========");
        double num = 25;
        double num2 = 5;

        double result = num % num2;
        System.out.println(result);

        System.out.println("========== Exercise 2 ==========");
        double num3 = 31;
        double num4 = 2;
        double result2 = num3 % num4;
        System.out.println(result2);

        System.out.println("========== Exercise 3 ==========");

        int totalSeconds = 342;
        int minute = totalSeconds / 60;
        int second = totalSeconds % 60;
        System.out.println("342 seconds is equal to " + minute + " minutes and " + "seconds " + second);



    }
}
