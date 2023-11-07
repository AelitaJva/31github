package com.java.Arrays;

public class LExercise3_Error {
    public static void main(String[] args) {
        String[] sentences = {"Hello World", "Java Code", "Test Results"};
        String replacement = "WEDEVX";
        System.out.println(replaceLastWord(sentences, replacement));

    }

    public static String[] replaceLastWord(String[] sentences, String replacement) {
        if (sentences == null || sentences.length == 0 || replacement == null || replacement.isEmpty()) {
            return new String[]{"Not enough length"};
        }

        String[] modifiedSentences = new String[sentences.length]; // Create a new array to store modified sentences

        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            if (sentence != null) {
                int indexOfLastWord = sentence.lastIndexOf(' ');
                if (indexOfLastWord != -1) {
                    String lastWord = sentence.substring(indexOfLastWord + 1);
                    sentence = sentence.substring(0, indexOfLastWord + 1) + replacement;
                }
                modifiedSentences[i] = sentence; // Store the modified sentence in the new array
            } else {
                modifiedSentences[i] = null; // Handle null sentences
            }
        }

        return modifiedSentences; // Return the array of modified sentences
    }
}
