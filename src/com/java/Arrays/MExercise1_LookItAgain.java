package com.java.Arrays;

import java.util.ArrayList;
import java.util.List;

public class MExercise1_LookItAgain {
    public static void main(String[] args) {
        String[] inputArray = {"Hello!", "This is a test", "1234", "#$%^&*", "Goodbye!"};
        System.out.println(findStringsContainingSpecialChars(inputArray));

    }

     static String[] findStringsContainingSpecialChars(String[] inputArray) {

        char[] specialChars = {',', '.', '!', '?', ';', ':', '-', '&', '#'};
        List<String> resultList = new ArrayList<>();

        for(String inputWord : inputArray) {
            for(char specialChar : specialChars) {
                if(inputWord.contains(String.valueOf(specialChar))) {
                    resultList.add(inputWord);
                    break;  // break teh inner loop if a special character is found
                }
            }
        }

        return resultList.toArray(new String[0]);

    }

}
