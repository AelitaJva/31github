package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.List;

public class AddMethodExercise1 {
    public static void main(String[] args) {
        System.out.println(lastVowelAndConsonant("hello world")); // Returns ['e', 'd']
        System.out.println(lastVowelAndConsonant("programming")); // Returns ['o', 'g']
        System.out.println(lastVowelAndConsonant("12345")); // Returns []
    }

    public static List<Character> lastVowelAndConsonant(String str) {

        List<Character> result = new ArrayList<>();

        if (str == null || str.isEmpty()) {
            return result;
        }

        char firstElement = 0;
        char lastElement = 0;


        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1 || firstElement == 0) {
                firstElement = ch;
            }

            if ("aeiouAEIOU".indexOf(ch) != -1 || Character.isLetter(ch)) {
                lastElement = ch;
            }
        }
        if (firstElement != 0) {
            result.add(firstElement);
        }
        if(lastElement!=0) {
            result.add(lastElement);
        }
        return result;
    }
}
