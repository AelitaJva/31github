package com.java.WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRetainsMethodExercise2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Arrays.asList("word1", "word3", "word5"));

        Set<String> set2 = new HashSet<>(Arrays.asList("word2", "word3", "word4"));
        System.out.println(commonEl(set1, set2));
    }

    public static Set<String> commonEl (Set<String> str1, Set<String> str2) {
        str1.retainAll(str2);
        return str1;
    }
}
