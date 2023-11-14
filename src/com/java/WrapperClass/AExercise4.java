package com.java.WrapperClass;

public class AExercise4 {

    public static void main(String[] args) {
        // Example usage:
        int[] array1 = {1, 2, 3, 4, 5};
        System.out.println(calculateAverage(array1)); // Should print 3.0

        int[] array2 = {10, 25};
        System.out.println(calculateAverage(array2)); // Should print 17.5

        int[] array3 = {-5, 0, 5};
        System.out.println(calculateAverage(array3)); // Should print 0.0
    }

    // Method to calculate the average of an array of integers
    public static double calculateAverage(int[] array) {
        if (array.length == 0) {
            return 0.0; // Handle the case of an empty array to avoid division by zero
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (double) sum / array.length;
    }
}
