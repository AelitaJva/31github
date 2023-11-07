package com.java.Arrays;

import java.util.Arrays;

public class JExercise1 {
    public static void main(String[] args) {
        String defaultStr = "The quick brown fox jumps over the lazy dog. The dog barks, but the fox keeps running";
        System.out.println(findMaxWord(defaultStr));
    }

    public static String findMaxWord(String sentences) {

        String[] words = sentences.split("\\s+");

        int maxLength = 0;
        String maxWord = " ";

        if (sentences.isEmpty() || sentences == null) {
            return maxWord;
        }


        for (String word : words) {
            int wordLength = word.length(); // here u are taking the word as a String, that's why u used length();
            if (wordLength > maxLength) {
                maxLength = wordLength;
                maxWord = word;
            }
        }
        return maxWord;

    }
}
