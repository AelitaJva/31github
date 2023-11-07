package com.java.Arrays;

import java.util.Arrays;

public class ArrayStringSplit {
    public static void main(String[] args) {

        // .split(String str); the param is the delimeter
        // where do I want to break the string


        String fullName = "Elon Musk";

        String[] names = fullName.split(" "); // breaks the string into 2 strings
        System.out.println(Arrays.toString(names));


        // your task will be to find the age of John
        // what are regex and how to use?

        String csv = "Name, Age, Gender\n" +
                     "John, 25, Male\n" +
                     "Mary, 30, Female";

        System.out.println(csv);

        String[] arr = csv.split("[,\n]");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);


        // print out the age of Marry
        for(int i=3; i<arr.length; i+=3) {
            if(arr[i].equals("Mary")) {
                System.out.println(arr[i + 1]);
            }
        }



    }
}
