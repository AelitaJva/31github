package com.java.Arrays;

import java.util.Arrays;

public class DExercise1 {

    public static void convertStringArrayToString(String[] things) {
        System.out.println(Arrays.toString(things));
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry"};
        convertStringArrayToString(arr);
    }
}
