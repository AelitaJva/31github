package com.java.Arrays;

public class BExercise1 {
    public static void main(String[] args) {
        String[] array1 = {"First", "Second", "Third", "Fourth"};
        String[] array2 = {"NonEmpty", "Maybe", "For sure"};
        String[] array3 = {"Good", "Luck", "Beloved", "Champs"};

        System.out.println(combineWords(array1, 4)); // Should print "SecondSecondSecondSecondFirst"
        System.out.println(combineWords(array2, 0)); // Should print "N is not positive"
        System.out.println(combineWords(array3, 5));    // Should print "Both are equal"
    }
    public static String combineWords(String[] str, int num) {

        if (str.length == 0) {
            return "Array is empty";
        } else if (num <= 0) {
            return "N is not positive";
        }

        String firstElement = str[0];
        String secElement = str[1];

        if (firstElement.length() > secElement.length()) {

            String result = "";
            for (int i = 0; i < num; i++) {
                result += firstElement;
            }
            return result += secElement;
        } else if (secElement.length() > firstElement.length()) {
            String result = "";
            for (int i = 0; i < num; i++) {
                result += secElement;
            }
            return result += firstElement;
        } else {
            return "Both are equal";
        }
    }
}
