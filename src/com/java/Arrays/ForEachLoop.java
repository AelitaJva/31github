package com.java.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] nums = {12, 455, 2, 33, 23};

        // limitation of for each loop
        // you can only start from the beginning and go till the end of collection (not strong loop)

        // if you need to use the indexes to solve the problem
        // then you need to use regular for loop (strong loop)


        for (int num : nums) {
            System.out.println(num);
        }


        int smallest = nums[0];
        for (int num : nums) {
            if (smallest > num) {
                smallest = num;
            }
        }

        System.out.println(smallest);


        String[] arr = {"cat", "dog", "horse"};
        for(String str : arr) {
            if(!str.equals("horse")) {
                System.out.println(str);
            }
        }


    }
}
