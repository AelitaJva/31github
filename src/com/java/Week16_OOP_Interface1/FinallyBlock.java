package com.java.Week16_OOP_Interface1;

public class FinallyBlock {
    public static void main(String[] args) {
method1();
    }

    // finally is a block of code in try catch pair
    // that is executed regardless of the result of pair block
    // it's used for cleaning up and quitting resources.

    public static void method1 () {
        try {
            System.out.println("Try");
        }catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Clean up");
        }
    }

    // what is the difference between final and finally?
    // they are not related at all
    // final can be used with variables, methods adn classes
    // if the var is final it can only be initialzed only once
    // if the method is final it can not be overriden
    // if the class is final it can not be extended

    // finally is block of code in try catch pair that is executed regardless of the result of
    // try and catch.
    // it's used for cleaning up and quitting resources.
}
