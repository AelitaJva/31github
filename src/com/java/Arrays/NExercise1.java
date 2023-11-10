package com.java.Arrays;

public class NExercise1 {
    // matrix numbers
    public static void main(String[] args) {
        int[][] integers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] transposedMatrix = transposeMatrix(integers);

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(integers);

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transposedMatrix);
    }

    public static int[][] transposeMatrix(int[][] integers) {

        if (integers.length == 0 || integers == null) {
            return new int[0][0];
        }

        int rows = integers.length;
        int columns = integers[0].length;


        int[][] updatedMatrixArray = new int[columns][rows];



        for (int i = 0; i < rows; i++) {
            for(int j=0; j<columns; j++) {
                updatedMatrixArray[j][i] = integers[i][j];
            }
        }
        return  updatedMatrixArray;
    }

    public static void printMatrix (int[][] integers) {
        for(int i=0; i<integers.length; i++) {
            for(int j=0; j<integers[0].length; j++) {
                System.out.println(integers[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
