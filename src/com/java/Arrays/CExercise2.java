package com.java.Arrays;

public class CExercise2 {
    public static void main(String[] args) {
        String[] stringArray = {"hello", "world", "how", "are", "you"};
        int[] result = countVowels(stringArray);

        for (int count : result) {
            System.out.print(count + " ");
        }
    }

    public static int[] countVowels(String[] arr) {
        if(arr == null || arr.length == 0) {
            return new int[] {-1};
        }

        int[] countValue = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            int count = 0;
            String str = arr[i].toLowerCase();

            for(int j=0; j<str.length(); j++) {
                char c = str.charAt(j);

                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            countValue[i] = count;
        }
        return countValue;
    }
}
