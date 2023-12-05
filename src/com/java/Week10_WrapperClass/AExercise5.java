package com.java.Week10_WrapperClass;

public class AExercise5 {
    public static void main(String[] args) {
        int[] countOccurrences = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        String representation = "4";
        System.out.println(countOccurrences(countOccurrences,representation));

        int[] array2 = {1, 2, 3};
        System.out.println(countOccurrences(array2, "4")); // Should print "0"

        int[] array3 = {};
        System.out.println(countOccurrences(array3, "4"));
    }
    public static String countOccurrences(int[] arrNums, String specialNum) {
        int count = 0;
        int updatedSpecial = Integer.parseInt(specialNum);

        for (int num : arrNums) {
            if (num == updatedSpecial) {
                count++;
            }
        }

        return Integer.toString(count);
    }
}
