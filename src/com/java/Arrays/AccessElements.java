package com.java.Arrays;

public class AccessElements {
    public static void main(String[] args) {

        // index of elements starts from 0
        int[] arr = {10, 13, 24, 20, 10};

        // to store in variables
        int num = arr[0]; //10
        System.out.println(num);

        // just print out using this statement
        System.out.println(arr[1]);

        // use the value of elements to do some calculation
        int sum = arr[1] + arr[4]; // 13 + 20
        System.out.println(sum);

        // I can access the element and change it's value
        arr[4] = 55;
        System.out.println(arr[4]);



    }
}
