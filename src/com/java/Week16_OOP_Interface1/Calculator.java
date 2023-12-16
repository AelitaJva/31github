package com.java.Week16_OOP_Interface1;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            int result = calculator.divide(2, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) throws ArithmeticException {

        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }

        return dividend / divisor;
    }
}
