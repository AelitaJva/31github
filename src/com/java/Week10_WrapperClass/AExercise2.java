package com.java.Week10_WrapperClass;

public class AExercise2 {
    public static Integer sumOfIntegers (String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        return  n1 + n2;
    }

    public static void main(String[] args) {
        String num1 = "10";
        String num2 = "20";
        System.out.println(sumOfIntegers(num1, num2));
    }
}
