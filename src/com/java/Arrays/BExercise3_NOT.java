package com.java.Arrays;

public class BExercise3_NOT {

    public static void main(String[] args) {
        boolean[] array1 = {true, false, false, false, true, false};
        boolean[] array2 = {false, false, false, true, false, false, false};
    }
    public static int checkMiddle (boolean[] arr) {
        int middleIndex = arr.length / 2;

        if(arr.length % 2 == 1) {
            return arr[middleIndex] ? 1 : -1;
        }
        return middleIndex;
    }
}
