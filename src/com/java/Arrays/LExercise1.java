package com.java.Arrays;

public class LExercise1 {
    public static String findLastWord (String sentence) {
        if(sentence == null || sentence.isEmpty()) {
            return "No words found.";
        }

        int indexOfLastSpace = sentence.lastIndexOf(' ');
        if(indexOfLastSpace == -1) {                             // if it doesn't find any space, it returns -1 as an error
            return sentence;
        }

        return sentence.substring(indexOfLastSpace + 1);

    }

    public static void main(String[] args) {
        String sentence = "Today is a good day";
        System.out.println(findLastWord(sentence));

    }
}
