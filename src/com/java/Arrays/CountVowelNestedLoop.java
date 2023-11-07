package com.java.Arrays;

public class CountVowelNestedLoop {
    public static void main(String[] args) {
        // create a string array with AI concepts
        // "neural networks", "deep learning", "reinforcement learning", "artificial general intelligence"
        // print out the number of vowels in each concept in the array.


        String[] aiArr = {"neural networks", "deep learning", "reinforcement learning", "artificial general intelligence"};


        for (int i = 0; i < aiArr.length; i++) {
            int counter = 0;
            String eachWord = aiArr[i];

            for (int x = 0; x < eachWord.length(); x++) {
                if (eachWord.charAt(x) == 'a' || eachWord.charAt(x) == 'e' || eachWord.charAt(x) == 'o' ||
                        eachWord.charAt(x) == 'u' || eachWord.charAt(x) == 'y' || eachWord.charAt(x) == 'i') {
                    counter++;
                }
            }
            System.out.println(eachWord + " has " + counter + " vowels");
        }




    }
}
