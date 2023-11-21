package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class SizeMethodExercise2 {

    public static List<String> filterWords(String[] words) {
        List<String> filteredList = new ArrayList<>();

        for (String word : words) {
            // Check conditions for filtering
            if (word.length() > 5 || countSpecialCharacters(word) >= 1 && countSpecialCharacters(word) <= 3) {
                filteredList.add(word);
            }
        }

        return filteredList;
    }

    private static int countSpecialCharacters(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "World!", "JS", "@OpenAI", "Chatbot", "Test123", "$$", "!^$#"};
        List<String> result = filterWords(words);

        System.out.println(result);
    }
}
