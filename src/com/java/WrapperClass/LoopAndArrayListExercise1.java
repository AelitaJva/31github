package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopAndArrayListExercise1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("air", "world", "programming", "java", "openai"));
        manipulateStrings(words);
    }

    public static void manipulateStrings(ArrayList<String> words) {
        for (String word : words) {
            int length = word.length();
            if (length < 5) {
                String uppercaseWord = word.toUpperCase();
                System.out.println(uppercaseWord);
            } else if (length >= 5 && length <= 10) {  // to check the number is between 5 and 10
                char[] charArray = word.toCharArray(); // to store the all characters into the char Array
                int start = 0;
                int end = charArray.length - 1;        // charArray.length - array length -> length

                while (start < end) {
                    char temp = charArray[start];      // to store the start in a temporary variable
                    charArray[start] = charArray[end];
                    charArray[end] = temp;
                    start++;
                    end--;
                }
                System.out.println(new String(charArray));
            } else {
                String result = word.replaceAll("[aeiouAEIOU]", "");
                System.out.println(result);
            }
        }
    }
}
