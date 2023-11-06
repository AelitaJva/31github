package com.java.Arrays;

public class PrintLast {
    public static void main(String[] args) {

        // print out last names each researcher
        String[] aiResearchersArr = {"Geoffrey Hinton", "Yann LeCun", "Andrew Ng", "Fei-Fei Li"};

        // find the solution for one String
        String geoffrey = "Geoffrey Hinton";

        int indexOfSpace = geoffrey.indexOf(' ');
        System.out.println(indexOfSpace);

        System.out.println(geoffrey.substring(indexOfSpace + 1));

    }
}
