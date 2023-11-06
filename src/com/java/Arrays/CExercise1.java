package com.java.Arrays;

public class CExercise1 {
    public static int findMaxValue(int[] num) {

        if (num.length == 0) {
            return 0;
        }

        int max = num[0];

        for (int i = 0; i < num.length; i++) {

            if (max < num[i]) {
                max = num[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array1 = {3, 7, 2, 9, 4};
        int[] array2 = {-1, -5, -3, -7};
        int[] emptyArray = {};

        System.out.println(findMaxValue(array1));
        System.out.println(findMaxValue(array2));
        System.out.println(findMaxValue(emptyArray));

    }
}
