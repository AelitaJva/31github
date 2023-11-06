package com.java.Week3_InputFromUser;

public class LessThanAndMoreThanComparisonOperators {
    public static void main(String[] args) {

        double stockCurrentPrice = 550.50;
        double buyThreshold = 300;
        double sellThreshold = 500;

        boolean shouldIBuy = stockCurrentPrice < buyThreshold;
        System.out.println("Should I buy the stock? " + shouldIBuy);

        boolean shouldISell = stockCurrentPrice > sellThreshold;
        System.out.println("Should I sell the stock? " + shouldISell);

    }
}
