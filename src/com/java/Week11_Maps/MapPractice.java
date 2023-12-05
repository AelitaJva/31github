package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        //given a string(text) write a program
        // that prints the number of times each word occurs in the text

        // ex: hello word hello aelita aelita adelina aelita
        // hello = 2
        // world = 1
        // aelita  = 3
        // adelina = 1

        String text = "hello word hello aelita aelita adelina aelita";

        String[] words = text.split("\\s+");
        Map<String, Integer> wordOccurrence = new HashMap<>();

        for (String word : words) {
            Integer currentValue = 0;

            if (wordOccurrence.containsKey(word)) {
                // get method returns null if the word doesn't exist
                currentValue = wordOccurrence.get(word);
            }
            wordOccurrence.put(word, currentValue + 1);
        }
        System.out.println(wordOccurrence);
    }
}