package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeExercise2 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Apple", "Banana", "Avocado", "orange", "Artichoke"));
        String specificLetter = "A";
        int result = countWordsStartingWith(words, specificLetter);
        System.out.println(result);
    }

    public static int countWordsStartingWith(ArrayList<String> words, String specificLetter) {

        int count = 0;
        for (int i = 0; i < words.size(); i++) {

            String currentWord = words.get(i);

            if (currentWord.startsWith(specificLetter)) {
                count++;
            }
        }

        return count;
    }
}
