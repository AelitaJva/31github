package com.java.Arrays;

public class ArraysWithLoop {
    public static void main(String[] args) {

        int[] nums = {1, 4, 5,7, 12,22, 55, 99, 12};

        // the variable of an array offer a property called length
        // length in an array is property, not a method

        System.out.println(nums.length);

        System.out.println("=============");


        for(int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }

        System.out.println("=============");

        String[] cities = {"Singapore", "New York", "LA", "LV", "Miami"};

        for(int i=0; i<cities.length; i++) {
            System.out.println(cities[i]);
        }
    }
}
