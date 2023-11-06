package com.java.Week3_InputFromUser;

public class CompoundOperators2 {
    public static void main(String[] args) {
        // write a program that will increment the points by 3

        int points = 0;
        points += 3;
        System.out.println("1 shot " + points + " points");
        points += 3;
        System.out.println("2 shot " + points + " points");
        points += 3;
        System.out.println("3 shot " + points + " points");


        String str = "Hello";
        str += " DevX";
        System.out.println(str);


        // balance
        // transaction
        // update your balance

        double balance = 30500;
        System.out.println("Initial balance is " + balance);
        balance-=25000;
        System.out.println("Updated balance is "+ balance);


        // number of tasks should be decreasing by 1

        int totalTasks = 10;
        totalTasks-=1;
        totalTasks-=5;
        System.out.println("Updated tasks: " + totalTasks);

    }
}
