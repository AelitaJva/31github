package com.java.Arrays;

public class NExercise3 {
    public static void main(String[] args) {
        // Sample 2D array
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Find the maximum value in the 2D array
        int maxValue = findMaxValue(array);

        // Print the result
        System.out.println("The maximum value in the 2D array is: " + maxValue);
    }

    // Function to find the maximum value in a 2D array
    public static int findMaxValue(int[][] array) {
        // Initialize with the minimum possible integer value
        int maxValue = Integer.MIN_VALUE;

        // Iterate through the rows
        for (int i = 0; i < array.length; i++) {
            // Iterate through the columns
            for (int j = 0; j < array[i].length; j++) {
                // Update maxValue if a greater value is found
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }

        // Return the maximum value
        return maxValue;
    }
}
