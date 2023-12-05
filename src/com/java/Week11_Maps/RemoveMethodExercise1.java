package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class RemoveMethodExercise1 {
    public static void main(String[] args) {
        String inputString = "1 2 3 4 5 2 4 6 0 -3 -5 0 5";
        System.out.println(classifyAndDuplicateIntegers(inputString));
    }

    public static String classifyAndDuplicateIntegers(String str) {
        Map<Integer, String> newMap = new HashMap<>();
        String[] words = str.split(" ");

        for (String word : words) {
            int strNum = Integer.parseInt(word);

            if (!newMap.containsKey(strNum)) {
                if (strNum > 0 && strNum % 2 == 0) {
                    newMap.put(strNum, "Positive Even");
                } else if (strNum > 0 && strNum % 2 != 0) {
                    newMap.put(strNum, "Positive Odd");
                } else if (strNum == 0) {
                    newMap.put(strNum, "Zero");
                } else {
                    newMap.put(strNum, "Negative");
                }
            }
        }
        return newMap.toString();
    }
}

