package com.java.Arrays;

public class MExercise1_ERROR {

    public static void main(String[] args) {
        String[] inputArray = {"Hello!", "This is a test", "1234", "#$%^&*", "Goodbye!"};
        String[] resultArray = findStringContainingSpecialChars(inputArray);

        for(String result : resultArray) {
            System.out.println(result);
        }

    }

    public static String[] findStringContainingSpecialChars (String[] inputStrings) {

        char[] specialCharacters = {',', '.', '!', '?', ';', ':', '-', '&', '#'};

        int count = 0;

        for(String inputString : inputStrings) {
            for(char specialChar : specialCharacters) {
                if(inputString.contains(String.valueOf(specialChar))) {
                    count++;
                    break; // no need to check the other special characters for this string
                }
            }
        }


        String[] resultArray = new String[count];
        int resultIndex = 0;

        for(String inputString : inputStrings) {
            for(char specialChar : specialCharacters) {
                if(inputString.contains(String.valueOf(specialChar)));
                resultArray[resultIndex] = inputString;
                resultIndex++;
                break;
            }
        }

        return resultArray;
    }
}
