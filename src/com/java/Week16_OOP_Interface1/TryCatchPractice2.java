package com.java.Week16_OOP_Interface1;

public class TryCatchPractice2 {
    public static void main(String[] args) {
        boolean[] booleanArray = {true, false, true, false, true};

        int index1 = 2;
        int index2 = 8;

        boolean element1 = retrieveElement(booleanArray, index1);
        System.out.println("Element at index " + index1 + ": " + element1);

        boolean element2 = retrieveElement(booleanArray, index2);
        System.out.println("Element at index " + index2 + ": " + element2);
    }

    public static boolean retrieveElement (boolean[] array, int index) {

        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds.");
            return false;
        }
    }
}
