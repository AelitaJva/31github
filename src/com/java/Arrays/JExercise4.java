package com.java.Arrays;

public class JExercise4 {
    public static void main(String[] args) {
        double[] stockPrice = {110.5, 112.0, 109.75, 115.25, 118.0, 117.5, 119.75};
        findMaxStockPrice(stockPrice);
    }
    public static void findMaxStockPrice (double[] arr) {
        double maxStockPrice = arr[0];
        int dayOfMaxStock = 1;

        for(int i=0; i<arr.length; i++) {
            if(maxStockPrice < arr[i]) {
                maxStockPrice = arr[i];
                dayOfMaxStock = i;
            }
            dayOfMaxStock++;
        }
        System.out.println("The highest stock was $" + maxStockPrice + " on day" + dayOfMaxStock);
    }
}
