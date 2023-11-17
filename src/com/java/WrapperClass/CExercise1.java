package com.java.WrapperClass;

public class CExercise1 {
    public static void main(String[] args) {
        String str = "Hello World 123";
        System.out.println(countDigitsAndUpperCase(str));  // Output: Digits: 3, Uppercase: 2
    }


    public static String countDigitsAndUpperCase (String str) {

        int isUpperLetter = 0;
        int isDigit = 0;

        for(char ch : str.toCharArray()) {
            if(Character.isDigit(ch)) {
                isDigit++;
            } else if(Character.isUpperCase(ch)) {
                isUpperLetter++;
            }
        }


        return "Digits: " + isDigit + ", Uppercase: " + isUpperLetter;

    }
}
