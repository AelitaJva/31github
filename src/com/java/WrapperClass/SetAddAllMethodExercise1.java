package com.java.WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetAddAllMethodExercise1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("apple", "banana", "cherry"));
        Set<String> set2 = new HashSet<>(Arrays.asList("apple", "blueberry", "carrot"));
        System.out.println(filterDuplicates(set1, set2));
    }

    public static Set<String> filterDuplicates(Set<String> set1, Set<String> set2) {

        set1.addAll(set2);
        return set1;
    }

}
