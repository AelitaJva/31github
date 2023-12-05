package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapContainsExercise1 {
    public static void main(String[] args) {
        String inputSentence = "This is a sample sentence. This is another sentence.";
        System.out.println(checkDuplicatedWords(inputSentence));
    }

    public static Map<String, Boolean> checkDuplicatedWords (String str) {

        Map<String, Boolean> newUpdatedMap = new HashMap<>();

        String[] words = str.split(" ");
        for (String word : words) {
            boolean isUnique = !newUpdatedMap.containsKey(word);
            newUpdatedMap.put(word, isUnique);
        }

        return newUpdatedMap;

    }


}
