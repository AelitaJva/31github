package com.java.Week3_InputFromUser;

public class LessThanOrEqualTo {
    public static void main(String[] args) {

        // between $0 -  $100k inclusive tax is 10%

        double salary = 100000.00;
        boolean isTaxi10Percent = salary <= 100000;
        System.out.println(isTaxi10Percent);


        boolean is20Percent = salary >= 10001;
        System.out.println(is20Percent);


    }
}
