package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class revision {
    public static void main(String[] args) {
        String text = "List.of to create immutable lists, " +
                "which cannot be modified by adding elements, " +
                "I replaced it with new ArrayList<>(List.of(...)). " +
                "This change ensures that the lists created are mutable," +
                " and you can modify them by adding elements.";

        String[] words = text.split(" ");
        Map<String, Integer> wordOccurrence = new HashMap<>();


        Integer numOfWordOccurrence = 0;

        for (String word : words) {

            if (wordOccurrence.containsKey(word)) {
                numOfWordOccurrence = wordOccurrence.get(word);
            }

            wordOccurrence.put(word, numOfWordOccurrence + 1);
        }
        System.out.println(wordOccurrence);
    }
}
