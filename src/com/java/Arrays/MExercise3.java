package com.java.Arrays;

public class MExercise3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printAllNumbersInArray(array);
    }

    public static void printAllNumbersInArray (int[] nums) {
        for(int num : nums) {
            System.out.println(num);
        }
    }
}
