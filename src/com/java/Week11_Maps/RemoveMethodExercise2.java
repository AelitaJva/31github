package com.java.Week11_Maps;

import java.util.HashMap;
import java.util.Map;

public class RemoveMethodExercise2 {
    public static void main(String[] args) {
        String inputString = "1 2 3 4 5 2 4 6 0 -3 -5 0 5";
        System.out.println(classifyAndDeduplicateIntegers(inputString));
    }

    public static Map<Integer, String> classifyAndDeduplicateIntegers(String str) {

        Map<Integer, String> resultMap = new HashMap<>();
        String[] numbers = str.split("\\s+");

        for (String strNum : numbers) {
            int num = Integer.parseInt(strNum);

            if (resultMap.containsKey(num)) {
                resultMap.remove(num); // Remove the existing mapping for this number
            }

            if (num > 0 && num % 2 == 0) {
                resultMap.put(num, "Positive Even");
            } else if (num > 0 && num % 2 != 0) {
                resultMap.put(num, "Positive Odd");
            } else if (num == 0) {
                resultMap.put(num, "Zero");
            } else {
                resultMap.put(num, "Negative");
            }
        }

        return resultMap;
    }

}
