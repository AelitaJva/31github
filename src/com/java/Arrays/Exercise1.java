package com.java.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,12,56,53,5};
        int[] arr2 = {100, -1};
        int[] arr3 = {18};

        int result1 = calculateArr(arr1);
        int result2 = calculateArr(arr2);
        int result3 = calculateArr(arr3);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }

    public static int calculateArr (int[] arr) {
        if (arr.length <= 1) {
            return 1;
        }

        int sum = arr[0] + arr[arr.length - 1];
        return sum;
    }
}
