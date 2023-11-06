package com.java.Arrays;

import java.util.Scanner;

public class ExerciseArrayCreation {
   public static int[] findLength() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter any digit: ");
       int inputSize = scanner.nextInt();


       if(inputSize < 1) {
           return new int[]{0};
       } else {
           return new int[inputSize];
       }
   }

    public static void main(String[] args) {
        int[] newArray = findLength();
        System.out.println("Array length is: " + newArray.length);
    }
}
