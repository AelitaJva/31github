package com.java.Maps;

import java.util.HashMap;
import java.util.Map;

public class SizeIsEmptyMethodExercise4 {
    public static void main(String[] args) {
        String binaryDigits1 = "101010";
        String binaryDigits2 = "11011";
        System.out.println(convertBinaryMap(binaryDigits1));
        System.out.println(convertBinaryMap(binaryDigits2));
    }
    public static Map<Integer, String> convertBinaryMap(String str) {

        Map<Integer, String> newUpdatedMap = new HashMap<>();

        if (str.isEmpty() && str.matches("[01]+")) {
            newUpdatedMap.put(0, "NO BOOLEAN");
            return newUpdatedMap;
        }

        int index = 0;
        for (char c : str.toCharArray()) {
            if (c == '0') {
                newUpdatedMap.put(index, "false");
            } else if (c == '1') {
                newUpdatedMap.put(index, "true");
            }
            index++;
        }

        if (str.length() % 2 != 0) {
            newUpdatedMap.put(index, "null");
        }

        return newUpdatedMap;
    }
}
