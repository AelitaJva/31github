package com.java.WrapperClass;

import java.util.LinkedHashSet;

public class SetSizeExercise2 {
    public static void main(String[] args) {
        System.out.println(addUniqueChars("abc123"));  // Output: [a, b, c]
        System.out.println(addUniqueChars("def@ghi"));  // Output: []
        System.out.println(addUniqueChars("12345"));    // Output: [0]

    }

    public static LinkedHashSet<String> addUniqueChars(String str) {

        LinkedHashSet<String> uniqueChars = new LinkedHashSet<>();

        for(char character : str.toCharArray()) {
            if(Character.isLetter(character)) {
                uniqueChars.add(String.valueOf(character));
            } else if(Character.isDigit(character)) {
                uniqueChars.clear();
                uniqueChars.add("0");
                return uniqueChars;
            } else {
                uniqueChars.clear();
                return uniqueChars;
            }
        }

        return uniqueChars;
    }

}
