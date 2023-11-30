package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class GetMethodExercise1_Error {
    public static void main(String[] args) {
        String words = "apple banana apple orange banana apple";
        Map<String, Integer> result = countWordFrequency(words);
        System.out.println(result);
    }

    public static Map<String, Integer> countWordFrequency(String sentence) {
        // Create a HashMap to store word-frequency pairs
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split("\\s+");

        // Count the frequency of each word
        for (String word : words) {
            // Convert the word to lowercase to ensure case-insensitivity
            String lowercasedWord = word.toLowerCase();

            // Update the frequency in the map
            wordFrequencyMap.put(lowercasedWord, wordFrequencyMap.getOrDefault(lowercasedWord, 0) + 1);
        }

        return wordFrequencyMap;
    }
}
