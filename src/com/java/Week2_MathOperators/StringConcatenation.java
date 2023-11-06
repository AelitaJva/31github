package com.java.Week2_MathOperators;

public class StringConcatenation {
    public static void main(String[] args) {


        String firstName = "Aelita";
        String lastName ="Jelden";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        String address =  "123 Main str";
        String city = "Chicago";
        String country = "USA";
        String zipCode = "60601";

        String fullAddress = address + ", " + city + ", " + country + ", " +  zipCode;
        System.out.println(fullAddress);


    }
}
