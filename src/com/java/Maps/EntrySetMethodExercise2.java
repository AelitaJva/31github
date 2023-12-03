package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMethodExercise2 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>(Map.of("Apple","A fruit with a red or yellowish skin and crisp flesh", "Sun","The star around which the Earth orbits"));
        printDictionary(dictionary);
    }

    public static void printDictionary(Map<String, String> dictionary) {

        for(Map.Entry<String, String> dictionaryMeaning : dictionary.entrySet()) {
            String word = dictionaryMeaning.getKey();
            String meaning = dictionaryMeaning.getValue();
            System.out.println(word + " - " + meaning);
        }
    }
}
