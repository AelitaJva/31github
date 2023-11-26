package com.java.WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetContainsMethodExercise1 {
    public static void main(String[] args) {
        Set<String> words =  new HashSet<>(Arrays.asList("apple", "banana", "orange", "avocado"));
        String wordToCheck = "Apple";
        System.out.println(checkWord(words, wordToCheck));

    }

    public static boolean checkWord (Set<String> words, String wordToCheck) {
        return words.contains(wordToCheck.toLowerCase());
    }
}
