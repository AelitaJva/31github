package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class GetMethodExercise2 {
    public static void main(String[] args) {
        String sentence = "I have 2 apples and 3 bananas!";

        System.out.println(checkWordCharacters(sentence));
    }

    public static Map<String, Boolean> checkWordCharacters (String str) {

        Map<String, Boolean> resultedMap = new HashMap<>();


        String[] words = str.split(" ");

        for(String word : words) {

            boolean hasLowerCase = false;

            for(char c : word.toCharArray()) {
                if(Character.isLowerCase(c)) {
                    hasLowerCase = true;
                    break;  // No need to check the rest of the characters if one is lowercase
                }
            }

            resultedMap.put(word, hasLowerCase);


//            for(char ch : word.toCharArray()) {
//                if(Character.isLowerCase(ch)) {
//                    boolean indicatesFalse = false;
//                    resultedMap.put(word, indicatesFalse);
//                } else {
//                    boolean indicatesTrue = true;
//                    resultedMap.put(word, indicatesTrue);
//                }
//            }
        }

        return resultedMap;
    }
}
