package com.java.Week16_OOP_Interface1;

public class CatchExceptionMessages {
    public static void main(String[] args) {
        method1();
        System.out.println("I am still alive");
    }

    public static void method1 () {


        try {
            System.out.println("Started TRY");
            int[] nums = new int[2];
            int num = nums[5];
            System.out.println("Everything went well and finish TRY");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            e.printStackTrace();
            // print meaningful message that then will be helpful
            // to understand which method/class/line has problem


            // what do you put in catch clause?
            // 1. Print out exception message
            // 2. print stack trace to be able to troubleshoot
            //    where the exception were thrown in my big program.
        }
    }
}
