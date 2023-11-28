package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class PutMethodExercise1 {
    public static void main(String[] args) {
        String sentence = "I have an apple and a banana";
        System.out.println(countVowels(sentence));
    }

    public static Map<String, Integer> countVowels(String sentence) {
        Map<String, Integer> vowelCountMap = new HashMap<>();

        String[] words = sentence.split("\\s+");

        for (String word : words) {
            // Count vowels in each word
            int vowelCount = isVowel(word);

            // Put the word and its vowel count into the map
            vowelCountMap.put(word, vowelCount);
        }

        return vowelCountMap;
    }

    public static int isVowel(String word) {

        int vowelCount = 0;

        word = word.toLowerCase();

        for (char c : word.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
