package com.java.WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetThroughLoopsExercise1 {
    public static void main(String[] args) {
        Set<String> elements = new HashSet<>(Arrays.asList("1", "2", "3", "4", "5"));
        System.out.println(findLast(elements));
    }

//    public static int findLast (Set<Integer> numbers) {
//
//        int lastElement = 0;
//
//        for(int element : numbers) {
//            lastElement = element;
//        }
//
//        return lastElement;
//    }

    //In a HashSet, the order of elements is not guaranteed,
    // so using a for-each loop to iterate through the set
    // won't reliably identify the "last" element
    // in the sense of the order in which elements were added.
    public static String findLast (Set<String> numbers) {

        String lastElement = null;

        for(String element : numbers) {
            lastElement = element;
        }

        return lastElement;
    }
}
