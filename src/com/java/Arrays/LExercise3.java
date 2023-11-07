package com.java.Arrays;

public class LExercise3 {


    public static void main(String[] args) {
        String[] sentences = {"Hello World", "Java Code", "Test Results"};
        String replacement = "WEDEVX";

        System.out.println(replaceLastWord(sentences, replacement));
    }


    public static String[] replaceLastWord(String[] sentences, String replacement) {

        if (sentences.length == 0 || sentences == null || replacement == null || replacement.isEmpty()) {
            return new String[]{"Not enough length;"};
        }

        String[] modifiedSentences = new String[sentences.length];


        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];

            if (sentence != null) {
                int indexOfLastSpace = sentence.lastIndexOf(' ');
                if (indexOfLastSpace != -1) {
                    String updatedSentence = sentence.substring(0, indexOfLastSpace + 1) + replacement;
                    modifiedSentences[i] = updatedSentence;
                } else {
                    modifiedSentences[i] = replacement;
                }
            } else {
                modifiedSentences[i] = null;
            }
        }
        return modifiedSentences;
    }
}
