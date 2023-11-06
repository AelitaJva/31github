package com.java.Arrays;

public class Exercise4 {
    public static void powerOfTwo (int[] arr) {

        if(arr.length <= 2) {
            System.out.println("Not enough");
        }else {
            int firstSquare = arr[0] * arr[0];
            int sum = arr[1] + arr[2];

            if(firstSquare >= sum) {
                System.out.println("First is the greater");
            }else {
                System.out.println("There is no power in first");
            }
        }
    }

    public static void main(String[] args) {
        int[] array1 = {2, 5, 3};
        int[] array2 = {4, 3};
        int[] array3 = {2, 7, 7};
        powerOfTwo(array1);
        powerOfTwo(array2);
        powerOfTwo(array3);

    }
}
