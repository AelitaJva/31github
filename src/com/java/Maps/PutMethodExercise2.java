package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class PutMethodExercise2 {
    public static void main(String[] args) {
        String sentence = "I have an apple and a banana";
        System.out.println(checkWordLength(sentence));
    }

    public static Map<String, Boolean> checkWordLength(String str) {
        Map<String, Boolean> lengthOfWordInMap = new HashMap<>();

        String[] words = str.split("\\s+");

        for (String word : words) {
            boolean oddOrEven = isEvenOdd(word);

            lengthOfWordInMap.put(word, oddOrEven);
        }

        return lengthOfWordInMap;
    }

    public static boolean isEvenOdd(String str) {
        return str.length() % 2 == 0;
    }
}
