package com.java.Week11_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAndListExercise2 {
    public static void main(String[] args) {
        String str =  "Hello, World! OpenAI 2023";
        System.out.println(sortWordsIntoCategories(str));
    }

    public static Map<String, List<String>> sortWordsIntoCategories(String input) {
        // Create a Map to store the result
        Map<String, List<String>> resultMap = new HashMap<>();

        // Split the input string into words
        String[] words = input.split("[^a-zA-Z0-9-]+");

        // Initialize lists for each category
        List<String> hasUppercase = new ArrayList<>();
        List<String> allLowercase = new ArrayList<>();
        List<String> hasSpecialCharacter = new ArrayList<>();
        List<String> hasDigit = new ArrayList<>();

        // Iterate through each word and categorize it
        for (String word : words) {
            if (!word.isEmpty()) {
                if (containsUppercase(word)) {
                    hasUppercase.add(word);
                } else if (isAllLowercase(word)) {
                    allLowercase.add(word);
                } else if (containsSpecialCharacter(word)) {
                    hasSpecialCharacter.add(word);
                } else if (containsDigit(word)) {
                    hasDigit.add(word);
                }
            }
        }

        // Add lists to the resultMap
        resultMap.put("Has Uppercase", hasUppercase);
        resultMap.put("All Lowercase", allLowercase);
        resultMap.put("Has Special Character", hasSpecialCharacter);
        resultMap.put("Has Digit", hasDigit);

        return resultMap;
    }

    private static boolean containsUppercase(String word) {
        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAllLowercase(String word) {
        return word.chars().allMatch(Character::isLowerCase);
    }

    private static boolean containsSpecialCharacter(String word) {
        return !word.matches("[a-zA-Z0-9]+");
    }

    private static boolean containsDigit(String word) {
        return word.matches(".*\\d+.*");
    }
}
