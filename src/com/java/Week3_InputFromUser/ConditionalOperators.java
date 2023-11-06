package com.java.Week3_InputFromUser;

public class ConditionalOperators {
    public static void main(String[] args) {

        // && -> returns true if both sides of the operators are true, other it returns false
        // || -> returns true if either side of the operators are true, other it returns false.

        boolean a = true;
        boolean b  = false;

        System.out.println(a & b); // false bc only one part is true

        boolean a1 = true;
        boolean b1 = true;
        System.out.println(a1 & b1); // true bc both sides are true
        System.out.println(a1 | b1);
    }
}
