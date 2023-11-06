package com.java.Arrays;

public class Exercise5 {

    public static int printFirstElement(int[] arr) {

        if(arr[0] > 0) {
            return arr[0];
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] array = {-5, 10, 6, 9, 3};
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(printFirstElement(array));
        System.out.println(printFirstElement(array1));

    }
}
