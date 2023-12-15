package com.java.Week16_OOP_Interface1;

public class Exceptions1Exercise {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        divideNums(a, b);
    }

    public static int divideNums(int a, int b) {

        try {
            int result =  a / b;
            return result;
        } catch (Exception e) {
            System.out.println("Error: Division by zero occurred.");
            return 0;
        }
    }
}
