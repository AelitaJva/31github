package com.java.Week2_MathOperators;

public class FormatSpecifier4 {
    public static void main(String[] args) {
        // %d = for integer
         int num = 12;
        System.out.printf("%d", num);


        // %,d
        int myFirstSalary = 168000;
        System.out.printf("\n%,d", myFirstSalary);

        long psyGangnamStyleViewsOnYT = 6000000000l;
        System.out.printf("\n%,d", psyGangnamStyleViewsOnYT);


        // %+-1d
        short temp = 73;
        //System.out.printf ("\n%+-1d",temp );

        System.out.printf("\n%+-1d temp", temp);
        // mm/dd/yyyy

        int month = 1;
        int day = 3;
        int year = 2022;

        System.out.printf("\n%02d/%02d/%d", month, day, year);

    }
}
