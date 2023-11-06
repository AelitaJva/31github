package com.java.Arrays;

public class ArrayDataAnalysisPractice {


    public static void main(String[] args) {
        // imagine we work for amazon
        // our task is to find what is the average daily revenue
        // how much do all users spend every day in revenue

        double[] dailyRevenueArr = {25.0, 10.2, 44.5, 14.7};
        // average = sum of all numbers dived by the count of number


        // when you are using = sign alone
        // you are overriding the old value

        double sum = 0;
        for(int i=0; i<dailyRevenueArr.length; i++) {
            sum += dailyRevenueArr[i];
            // i:0=25.0 = 0 + 25.0
            // i:0=10.2 = 25.0 + 10.2 = 35.2
            // i:0=33.5 = 35.2 + 33.5 = 79.7
            // i:0=14.7 = 79.7 + 14.7 = 94.7
           //  System.out.println(sum); => prints all the values of each i
        }
        System.out.println(sum);        // prints only the result of whole i's
        double average = sum / dailyRevenueArr.length;
        System.out.println("The daily average revenue is: " + average);
    }
}
