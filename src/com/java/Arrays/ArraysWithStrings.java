package com.java.Arrays;

public class ArraysWithStrings {
    public static void main(String[] args) {
        // Create a String array of AI researchers

        String[] aiResearchers = {"Geoffrey Hinton ", "Yann LeCun", "Andrew Ng", "Fei-Fei Li"};

//         first find the solution for one String
//        String geoffrey = "Geoffrey Hinton ";
//        int indexOfSpace = geoffrey.indexOf(' ');
//        System.out.println(indexOfSpace);
//        System.out.println( geoffrey.substring(indexOfSpace + 1));

        for (int i = 0; i < aiResearchers.length; i++) {
            String fullName = aiResearchers[i];
            int indexOfSpace = fullName.indexOf(' ');
            System.out.println(fullName.substring(indexOfSpace + 1));
        }


    }
}
