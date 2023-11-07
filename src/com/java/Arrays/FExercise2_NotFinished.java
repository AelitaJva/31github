package com.java.Arrays;

public class FExercise2_NotFinished {
    public static void main(String[] args) {
        String[] arr = {"Hello, world!", "This is an example."};
        System.out.println(countWordsInArray(arr));
    }

    public static int countWordsInArray (String[] words) {
        int countWords = 0;

        if(words.length == 0 || words == null) {
            return countWords;
        }

        for(String word : words) {
            String[] wordArr = word.split("\\s+");
            countWords+=wordArr.length;
        }

        return countWords;
    }
}
