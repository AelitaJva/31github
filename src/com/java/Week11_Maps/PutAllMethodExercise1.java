package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PutAllMethodExercise1 {
    public static void main(String[] args) {
        String sentence1 = "level eye Radar";
        String sentence2 = "OpenAI language model";

        Map<String, Boolean> result = checkWords(sentence1, sentence2);

        System.out.println(result);
    }
    public static Map<String, Boolean> checkWords(String sentence1, String sentence2) {

        Map<String, Boolean> resultMap = new LinkedHashMap<>();
        resultMap.putAll(checkPalindrome(sentence1));
        resultMap.putAll(checkUpperCase(sentence2));

        return resultMap;
    }

    public static Map<String, Boolean> checkUpperCase(String sentence) {
        Map<String, Boolean> capitalMap = new HashMap<>();

        String[] words = sentence.split("\\s+");

        for (String word : words) {
            capitalMap.put(word, startsWithCapital(word));
        }
        return capitalMap;
    }

    public static Map<String, Boolean> checkPalindrome(String sentence) {
        Map<String, Boolean> palindromeMap = new HashMap<>();

        String[] words = sentence.split("\\s+");

        for (String word : words) {
            palindromeMap.put(word, isPalindrome(word));
        }
        return palindromeMap;
    }

    public static boolean isPalindrome(String word) {
        word = word.toLowerCase();

        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static boolean startsWithCapital(String word) {
        return !word.isEmpty() && Character.isUpperCase(word.charAt(0));
    }

}
