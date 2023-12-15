package com.java.Week16_OOP_Interface1;

public class TryCatchPractice {
    public static void main(String[] args) {
        method1();
        System.out.println("Line 6");
    }

    public static void method1() {
        // catch unchecked exception = runtime exception = will stop compiling
        // checked exception - let me compile

        // whenever try executed successfully
        // catch block will skipped

        try {
            System.out.println("Beginning of the try");
            double result = 10 / 0;
            System.out.println("More stuff after trying divide by 0");
            System.out.println("More stuff after trying divide by 0");
            System.out.println("More stuff after trying divide by 0");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: / by zero occurred, but handled");
        }
    }
}
