package com.java.Arrays;

public class Exercise2 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,5,12,56,53,5};
        int[] arr2 = {100,-1};
        int[] arr3 = {18};
        int[] arr4 = {0, 0};

        System.out.println("The first result: " + subtractArray(arr1));
        System.out.println("The second result: " + subtractArray(arr2));
        System.out.println("The third result: " + subtractArray(arr3));
        System.out.println("The fourth result: " + subtractArray(arr4));

    }

    public static int subtractArray (int[] arr) {

        if (arr.length <= 1) {
            return 777;
        }

        int result = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            int current = arr[i];
            int nextElement = arr[i+1];

            if(current > nextElement) {
                return result = current - nextElement;
            } else if (nextElement > current) {
                return result =  nextElement- current;
            } else {
                return 777;
            }
        }
        return  result;
    }
}
