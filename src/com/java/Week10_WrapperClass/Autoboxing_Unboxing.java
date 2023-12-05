package com.java.Week10_WrapperClass;

public class Autoboxing_Unboxing {
    public static void main(String[] args) {
        Integer num = 27;  // autoboxing
        // autoboxing is a concept that converts
        // literal values of primitive data types into Wrapper class


        // int num2 = new Integer(24);  -> old version of the constructor, it's deprecated
        int num2 = Integer.valueOf(24); // inboxing
        // the process of converting Wrapper classes
        // into corresponding primitive data type



        // you can anything with Wrapper class as u do with primitive data types

        int sum = num2 + num;

        Double d = 25.0;
        Double d2 = 3.4;
        double result = d / d;
        System.out.println(result);



        //  Autoboxing and unboxing involve the automatic conversion
        //  between primitive types and their corresponding wrapper classes,
        //  such as int to Integer and vice versa.
    }
}
