package com.java.Arrays;

public class MExercise2 {

    public static void main(String[] args) {

        double[] nums = {1.2, 3.4, 5.6, 7.8, 9.0};
        double num = 5.0;
        System.out.println(calculateSum(nums, num));; // Returns 17.8


        double[] nums1 = {1.2, 3.4, 5.6, 7.8, 9.0};
        double num2 = 2.3;
        System.out.println(calculateSum(nums1, num2));

    }

    public static double calculateSum(double[] arrDob, double inputNum) {

        double runningSum = 0.0;


        if(arrDob == null || arrDob.length == 0) {
            return 0.0;
        }

        for(double currentElement : arrDob) {
            if(currentElement < inputNum) {
                runningSum-=currentElement;
            } else {
                runningSum+=currentElement;
            }
        }
        return runningSum;

    }
}
