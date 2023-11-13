package com.java.WrapperClass;

public class AExercise3 {
    public static void main(String[] args) {
        String firstName = "aelita";
        System.out.println("Result: " + getFirstCharacter(firstName));
    }

    public static char  getFirstCharacter (String firstName) {


        if(!firstName.isEmpty() || firstName != null) {
            return Character.toUpperCase(firstName.charAt(0));
        } else {
            throw new IllegalArgumentException("Input String is empty or null");
        }

    }
}
