package com.java.Arrays;

public class BExercise2 {
    public static void main(String[] args) {
        String[] array = {"Combo", "wedevx", " ", " This is the first line of the codeG"};
        System.out.println(checkLetter(array, 'G'));
    }

    public static boolean checkLetter(String[] str, char ch) {
        if(str.length == 0) {
            return false;
        }

        String lastWord = str[str.length - 1];
        return lastWord.toLowerCase().contains(String.valueOf(ch).toLowerCase());

    }
}
