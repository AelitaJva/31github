package com.java.Week10_WrapperClass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetRemoveAllMethodsExericse2 {
    public static void main(String[] args) {
        Set<String> setOfWords = new HashSet<>(Arrays.asList("apple", "banana", "cherry", "date", "fig"));
        Set<String> setOfStopWords = new HashSet<>(Arrays.asList("apple", "banana", "date", "grape"));
        System.out.println(filterUniqueElements(setOfWords, setOfStopWords));
    }


    public static Set<String> filterUniqueElements(Set<String> setOfWords, Set<String> setOfStopWords) {

        Set<String> combinedSet = new HashSet<>(setOfWords);
        combinedSet.addAll(setOfStopWords);

        Set<String> commonElements = new HashSet<>(setOfWords);
        commonElements.retainAll(setOfStopWords);


        combinedSet.removeAll(commonElements);

        return combinedSet;
    }

}
