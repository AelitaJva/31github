package com.java.Week10_WrapperClass;

import java.util.LinkedHashSet;

public class SetAddMethodExercise2 {

    public static void main(String[] args) {

        String str = "Hello 123 world! This is a test string 456 containing both words and numbers 789.";
        System.out.println(parseUniqueDigits(str));
    }

    public static LinkedHashSet<Integer> parseUniqueDigits(String str) {

        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        String currentNumber = "";

        for(char ch : str.toCharArray()) {

            if(Character.isDigit(ch)) {
                currentNumber+=ch;
            } else {
                if(!currentNumber.isEmpty()) {
                    result.add(Integer.parseInt(currentNumber));
                    currentNumber = ""; // reset the currentNumber
                }
            }
        }


        if (!currentNumber.isEmpty()) {
            result.add(Integer.parseInt(currentNumber));
        }

        return result;
    }
}
