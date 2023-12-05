package com.java.Week11_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapAndListExercise1 {
    public static void main(String[] args) {
        String input = "OpenAI is an artificial intelligence company";
        Map<Character, List<String>> result = separateWordsByStartingLetter(input);
        System.out.println(result);

        // Print the result
      //  result.forEach((key, value) -> System.out.println("'" + key + "' : " + value));
    }

    public static Map<Character, List<String>> separateWordsByStartingLetter(String str) {

        Map<Character, List<String>> resultMap = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                char startingLetter = word.charAt(0);
                int endIndex = word.length();

                while (endIndex > 0 && !Character.isLetterOrDigit(word.charAt(endIndex - 1)) && word.charAt(endIndex - 1) != '-') {
                    endIndex--;
                }

                String cleanedWord = word.substring(0, endIndex);

               // startingLetter = Character.toUpperCase(startingLetter);

                resultMap.computeIfAbsent(startingLetter, k -> new ArrayList<>()).add(cleanedWord);
            }
        }

        return resultMap;
    }
}
