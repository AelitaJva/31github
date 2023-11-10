package com.java.Arrays;

import java.util.Arrays;

public class MultiDimensionalArrays {
    // array can hold an array - multi-dimensional array
    // for QA is not crucial to use it, important for games,
    // graphical interface, if you are building that software

    // how to access 2d dimonsional array

    public static void main(String[] args) {
        // 3 length of array = outer array
        // 2 the amount of the array = inner array

        int[][] arr2d = new int[3][2];
        System.out.println(Arrays.deepToString(arr2d));


        arr2d[0][0] = 42;
        System.out.println(Arrays.deepToString(arr2d));

        arr2d[1][0] = 77;
        System.out.println(Arrays.deepToString(arr2d));

        arr2d[1][1] = 44;
        System.out.println(Arrays.deepToString(arr2d));


        arr2d[2][0] = 66;
        System.out.println(Arrays.deepToString(arr2d));
    }
}
