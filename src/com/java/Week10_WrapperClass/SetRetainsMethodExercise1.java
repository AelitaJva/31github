package com.java.Week10_WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRetainsMethodExercise1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "banana", "cherry", "date"));

        Set<String> set2 = new HashSet<>(Arrays.asList("banana", "date", "grape", "kiwi"));
        System.out.println(findCommonWords(set1, set2));
    }

    public static Set<String> findCommonWords(Set<String> set1, Set<String> set2) {

        set1.retainAll(set2);
        return set1;

    }

}
