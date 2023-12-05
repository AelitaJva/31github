package com.java.Week10_WrapperClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class SetInitializationExercise3 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "banana", "avocado"));
        System.out.println(returnLinked(fruits));

    }

    public static LinkedHashSet returnLinked (ArrayList<String> fruits) {
        LinkedHashSet<String> fruitsInLinkedHashSet = new LinkedHashSet<>(fruits);
        return fruitsInLinkedHashSet;
    }
}
