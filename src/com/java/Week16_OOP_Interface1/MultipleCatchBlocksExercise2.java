package com.java.Week16_OOP_Interface1;

public class MultipleCatchBlocksExercise2 {
    public static void main(String[] args) {
        int[] arr1 = null;
        int index1 = 0;

        findValueAtIndex(arr1, index1);
    }

    public static void findValueAtIndex(int[] array, int index) {
        try {
            // Attempt to access an element at the given index
            if (array != null) {
                int value = array[index];
                System.out.println(value);
            } else {
                throw new NullPointerException();
            }

        } catch (NullPointerException e) {
            // Handle NullPointerException
            System.out.println("Array is null: Please provide a non-null array");

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("Array index out of bounds: Please enter a valid index");

        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());

        }
    }
}
