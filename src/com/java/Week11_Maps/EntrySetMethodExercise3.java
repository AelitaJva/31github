package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMethodExercise3 {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Dialogue", "Education"};
        countAndPrintVowels(words);
    }

    public static void countAndPrintVowels(String[] words) {

        Map<String, Integer> countedWords = new HashMap<>();

        for(String word : words) {
            int vowelCount = countVowels(word);

            countedWords.put(word, vowelCount);
        }

        String maxVowelWord = findMaxVowelWord(countedWords);

        System.out.println(maxVowelWord + " - " + countedWords.get(maxVowelWord));
    }

    public static int countVowels(String word) {
        int count = 0;
        for (char ch : word.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static String findMaxVowelWord(Map<String, Integer> countedWords) {

        String maxVowelWord = null;
        int maxCount = -1;

        for(Map.Entry<String, Integer> entry : countedWords.entrySet() ) {
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxVowelWord = entry.getKey();
            }
        }
        return maxVowelWord;
    }
}
