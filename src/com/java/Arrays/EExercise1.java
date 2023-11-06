package com.java.Arrays;

public class EExercise1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] numbersA = {10, 20, 30, 40, 50};
        int[] numbersB = {0, 0, 0, 0, 0, 0};
        int[] numbersC = {};

        System.out.println(isSomeOfEvenDivisibleByFive(numbers));
        System.out.println(isSomeOfEvenDivisibleByFive(numbersA));
        System.out.println(isSomeOfEvenDivisibleByFive(numbersB));
        System.out.println(isSomeOfEvenDivisibleByFive(numbersC));

    }

    public static boolean isSomeOfEvenDivisibleByFive(int[] nums) {

        if (nums == null || nums.length == 0) {
            return false;
        }

        int sumOfEvens = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sumOfEvens += nums[i];
            }
        }
        return sumOfEvens % 5 == 0;

    }
}
