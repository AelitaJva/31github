package com.java.Week10_WrapperClass;

public class BExercise1 {
    public static void main(String[] args) {
        int num1 = 323;
        int num2 = 323;
        System.out.println(compareWrapperObjects(num1, num2));
    }

    public static boolean compareWrapperObjects (Integer num1, Integer num2) {
        String number1 = Integer.toString(num1);
        String number2 = Integer.toString(num2);


        return number1.equals(number2);
    }
}
