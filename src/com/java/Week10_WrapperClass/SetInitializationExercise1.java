package com.java.Week10_WrapperClass;

import java.util.*;

public class SetInitializationExercise1 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "banana", "avocado"));
        System.out.println(fruits);
        System.out.println(returnHash(fruits));
    }

    public static HashSet<String> returnHash(ArrayList<String> fruits) {
        HashSet<String> hashFruits = new HashSet<>(fruits);
        return hashFruits;
    }
}
