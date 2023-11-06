package com.java.Week3_InputFromUser;

public class PostAndPrefix {
    public static void main(String[] args) {

        int num = 10;
        int y = ++num;  // prefix increment or decrement operator will change/ update it's value itself
                        // and also assign that updated value.

        System.out.println(y);   //11
        System.out.println(num); //11


        int num1 = 20;
        int y1 = num1++; // post increment or decrement operator will first assign the old value
                         // then gonna increment or decrement value

        System.out.println(y1);   // 20
        System.out.println(num1); // 21


        int num3 = 5;
        int y3 = --num3;
        System.out.println(y3);   //2
        System.out.println(num3); //2

        int num4 = 7;
        int y4 = num4--;
        System.out.println(y4);   // 7
        System.out.println(num4); // 3
    }
}
