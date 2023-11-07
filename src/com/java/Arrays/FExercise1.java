package com.java.Arrays;

public class FExercise1 {
    public static void main(String[] args) {
        String[] arr = {"Hello", "world", "AI"};
        System.out.println(countVowelsArray(arr));
    }

    public static int countVowelsArray(String[] letters) {

        int sumOfVowels = 0;

        if (letters.length == 0 || letters == null) {
            return sumOfVowels;
        }


        for (int i = 0; i < letters.length; i++) {
            String word = letters[i];

            for (int j = 0; j < word.length(); j++) {
                char ch = Character.toLowerCase(word.charAt(j));

                if (ch == 'a' || ch == 'e' || ch == 'u' || ch == 'o' || ch == 'i') {
                    sumOfVowels++;
                }
            }

        }


        return sumOfVowels;

    }
}
