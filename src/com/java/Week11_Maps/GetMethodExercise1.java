package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class GetMethodExercise1 {
    public static void main(String[] args) {
        String str = "Alice is girl and Bob is boy";
        String words = "apple banana apple orange banana apple";
        System.out.println(countWordFrequency(words));
        System.out.println(countWordFrequency(str));
    }

    public static Map<String, Integer> countWordFrequency(String str) {

        Map<String, Integer> hashMap = new HashMap<>();

        // Splitting the words of string
        // and storing them in the array.
        // String[] words = str.split("\\s+");
        String[] words = str.split(" ");

        for (String word : words) {
            // Asking whether the HashMap contains the
            // key or not. Will return null if not.
            Integer countWordOccurrence = hashMap.get(word);


            if (countWordOccurrence == null) {
                // Storing the word as key and its
                // occurrence as value in the HashMap.
                hashMap.put(word, 1);
            } else {
                // Incrementing the value if the word
                // is already present in the HashMap.
                hashMap.put(word, countWordOccurrence + 1);
            }
        }

        return hashMap;
    }
}
