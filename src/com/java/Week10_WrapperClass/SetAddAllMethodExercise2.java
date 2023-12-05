package com.java.Week10_WrapperClass;

import java.util.HashSet;
import java.util.Set;

public class SetAddAllMethodExercise2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");
        set1.add("pear");

        Set<String> set2 = new HashSet<>();
        set2.add("apple");
        set2.add("blueberry");
        set2.add("pear");
        set2.add("carrot");

        int count = countNonUniqueElements(set1, set2);

        System.out.println("Count of Non-Unique Elements: " + count);
    }

    public static int countNonUniqueElements(Set<String> set1, Set<String> set2) {

        Set<String> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);

        int nonUniqueCount =  commonElements.size();
        return nonUniqueCount;

    }
}
