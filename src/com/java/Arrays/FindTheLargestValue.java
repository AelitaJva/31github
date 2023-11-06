package com.java.Arrays;

public class FindTheLargestValue {
    public static void main(String[] args) {
        // find the largest number in an array
        // and print it out

        int[] nums = {33, 55, 10, 5, 77, 22, 10};

        int left = nums[0];
        int right = nums[1];

        for(int i=2; i<nums.length; i++) {

            if (left <= right) {
                left = right;
            }
            right = nums[i];
        }
        System.out.println(left);
    }
}
