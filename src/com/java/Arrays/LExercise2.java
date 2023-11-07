package com.java.Arrays;

public class LExercise2 {
    public static void main(String[] args) {
        String[] sentences = {"Hello World", "Java Code", "Test Results"};
        System.out.println(findLastWordLength(sentences));
    }


    public static int findLastWordLength(String[] names) {
        if (names == null) {
            return -1;
        }

        int sum = 0;

        for(String name : names) {
            if(name != null) {
                int lastSpaceIndex = name.lastIndexOf(' ');
                if(lastSpaceIndex != -1) {
                    String  lastName = name.substring(lastSpaceIndex + 1);
                    sum+=lastName.length();
                }
            }
        }
        return sum;
    }
}
