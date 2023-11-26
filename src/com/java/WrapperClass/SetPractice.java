package com.java.WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        // create a program that converts array of words and counts the number of unique words
        // ignore punctuation and convert all words to lowercase for accurate counting

        String[] words = {"apple", "car", "apple", "orange", "blue", "pink", "java", "java", "java", "hello"};
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        int count = 0;

        // String[]  = new String[words.length];

        Set<String> encounteredWords = new HashSet<>(Arrays.asList(words));
        int amountOfUniqueWords = encounteredWords.size();


        System.out.println(encounteredWords);
        System.out.println(amountOfUniqueWords);

    }
}
