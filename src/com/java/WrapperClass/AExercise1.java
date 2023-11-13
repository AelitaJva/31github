package com.java.WrapperClass;

public class AExercise1 {
    public static void main(String[] args) {
        String str = "5678509";
        String str2 = "6748";
        System.out.println(calculateSum(str, str2));
    }
    public static int calculateSum (String str, String str2) {
        // converting Wrapper class into the primitive d.t

        // This method takes a string (str) and converts it
        // into an int primitive type. This is not autoboxing;
        // it's parsing a string to obtain an int.

        int num1 = Integer.parseInt(str);
        int num2 = Integer.parseInt(str2);
        return  num1 + num2;
    }
}
