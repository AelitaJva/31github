package com.java.Week3_InputFromUser;

public class ConditionalOperators2 {
    public static void main(String[] args) {
        // && - returns true if both sides are true, otherwise it returns
        // || = returns true false if both sides are false, otherwise it returns true
        // || = returns true if both sides or at least one side is true.

        // the biggest difference with short and long circuit is all about the performance / speed
        // the short circuit logical operators aren't the most popular.


        boolean a = true;
        boolean b = false;

        boolean result = a && b; // false
        System.out.println(result);

        boolean a1 = true;
        boolean b1 = true;
        boolean result1 = a1 && b1; // true
        System.out.println(result1);


        boolean a2 = false;
        boolean b2 = true;
                       //false &&e => here you already can conclude that one of them is false and logical
        boolean result2 = a2 && b2;


        boolean a3 = true;
        boolean b3 = false;
                        //true || -> here one of them is already true and the conclusion is familiar.
        boolean result3 = a3 || b3;
        System.out.println(result3);

    }
}
