package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class SetMethodExercise1 {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("level");
        words.add("radar");
        words.add("solar");
        words.add("hello");

        List<Boolean> palindromeResults = checkPalindromeWords(words);
        System.out.println(palindromeResults);
    }

    public static List<Boolean> checkPalindromeWords (ArrayList<String> words) {
        List<Boolean> results = new ArrayList<>();

        for(String word : words) {
            results.add(isPalindrome(word));
        }
        return results;

    }

    private static boolean isPalindrome (String word) {
        if(word.isEmpty() || word.length() == 1) {
            return true;
        }

        int start = 0;
        int end = word.length()-1;

        while (start < end) {
            if(word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start ++;
            end--;
        }
        return true;
    }

}
