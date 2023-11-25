package com.java.WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SetInitializationExercise2 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "banana", "avocado"));
        System.out.println(returnTree(fruits));
    }

    public static TreeSet<String> returnTree(ArrayList<String> fruits) {
        TreeSet<String> fruitsInTreeSet = new TreeSet<>(fruits);
        return fruitsInTreeSet;
    }
}
