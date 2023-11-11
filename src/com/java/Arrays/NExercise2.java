package com.java.Arrays;

public class NExercise2 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int row = 2;
        int column = 1;

        accessElement2D(array, row, column);
    }

    public static void accessElement2D(int[][] array, int row, int column) {
        // Check if the provided row and column indices are within the valid range
        if (row >= 0 && row < array.length && column >= 0 && column < array[0].length) {
            int element = array[row][column];
            System.out.println("Element at row " + row + " and column " + column + ": " + element);
        } else {
            System.out.println("Invalid row or column index.");
        }
    }
}
