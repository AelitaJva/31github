package com.java.Arrays;

import java.util.Arrays;

public class ArraysClassMethods {
    public static void main(String[] args) {

        // 1. Arrays.toString();
        // 2. Arrays.copyOf();
        // 3. Arrays.sort();
        // 4. Arrays.fill();


        // a. copyOf(); method with int
        int[] nums = {12, 56, 11, 1, 245};
        int[] nums2 = Arrays.copyOf(nums, 2);
        System.out.println(Arrays.toString(nums2));

        String[] fruits = {"banana", "apple", "pineapple", "watermelon"};
        String[] fruits2 = Arrays.copyOf(fruits, 3);
        System.out.println(Arrays.toString(fruits2));


        // b. copyOf(); method with String
        int[] numbers = {1, 57, 77, 3, 23};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        // c. Arrays.sort(); method with int and String

        Arrays.sort(fruits2);
        System.out.println(Arrays.toString(fruits2));


        // d. Arrays.fill(); method with int

        int[] numbers2 = new int[5];  // length of an array
        Arrays.fill(numbers, 10); // fill that array with the length of 5 with the value 10, 10 times
        System.out.println(Arrays.toString(numbers)); // 10, 10, 10, 10, 10


        // e. Arrays.equal(); returns true or false if at least 1 element is not equal

        int[] number4 = {1, 2, 3, 4, 5};
        int[] number5 = {1, 2, 3, 4, 5};
        boolean areEqual = Arrays.equals(number4, number5);
        System.out.println(areEqual);

        String[] strArr1 = {"hello", "superstar"};
        String[] strArr2 = {"hello", "superstar"};
        boolean areEqualStr = Arrays.equals(strArr1, strArr2);
        System.out.println("The array of Strings is equal: " + areEqualStr);

    }
}
