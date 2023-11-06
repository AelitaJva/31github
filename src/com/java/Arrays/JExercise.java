package com.java.Arrays;

public class JExercise {

    // ============================== main method ==============================
    public static void main(String[] args) {
        int[] intArray = {2, 6, 8, 12, 24};

        double[] doubleArray = {0.5, 1.25, 0.75, 2.5, 0.1};

       // findAndCalculate(intArray, doubleArray);
        System.out.println(findAndCalculate(intArray, doubleArray));
    }

    // ============================== findAndCalculate method ==============================
    public static double findAndCalculate(int[] numsInt, double[] numsDob) {
        int theBiggestInteger = findLargestInteger(numsInt);
        double theSmallestDouble = findSmallestDouble(numsDob);

        return theBiggestInteger - theSmallestDouble;
    }

    // ============================== the largest Integer method ==============================

    public static int findLargestInteger(int[] numsInt) {
        if (numsInt.length == 0) {
            return -1;
        }

        // the largest
        int leftInt = numsInt[0];
        int rightInt = numsInt[1];
        for (int i = 2; i < numsInt.length; i++) {
            if (leftInt <= rightInt) {
                leftInt = rightInt;
            } else {
                rightInt = numsInt[i];
            }
        }
        return leftInt;
    }


    // ============================== the largest Integer method ==============================
    public static double findSmallestDouble(double[] numsDob) {
        // the smallest
        if (numsDob.length == 0) {
            // Handle the case where the array is empty.
            // You can decide whether to return a default value or throw an exception.
            return Double.NaN; // For example, return NaN to indicate no valid result.
        }

        double theSmallest = numsDob[0];


        for (int j = 1; j < numsDob.length; j++) {
            if (theSmallest >= numsDob[j]) {
                theSmallest = numsDob[j];
            }
        }

        return theSmallest;
    }

}
