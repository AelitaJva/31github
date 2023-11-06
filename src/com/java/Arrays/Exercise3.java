package com.java.Arrays;

public class Exercise3 {
    public static int arraySubtraction(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int element1 = arr[i];
                int element2 = arr[j];

                int absoluteDifference = element1 - element2;
                if (absoluteDifference < 0) {
                    absoluteDifference -= absoluteDifference;
                }

                result += absoluteDifference;

            }
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 12, 56, 53, 5};
        System.out.println(arraySubtraction(arr1));

    }
}
