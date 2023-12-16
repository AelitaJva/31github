package com.java.Week16_OOP_Interface1;

public class ThrowsInMethodSignature {
    public static void main(String[] args) {
        transfer();
    }

    // throws keyword is used to declare exceptions in the
    // method signature
    // which means the method has a block of code that throws an exception
    // to apply the logic that try catch

    public static void withdraw(int amount) throws Exception {
        int balance = 100;
        if (amount > balance) {
            // throw keyword -> actually throws an exception
            // c
            throw new Exception("Insufficient funds");
        }
    }

    public static void transfer() {
        try {
            withdraw(50);
        } catch (Exception e) {
            System.out.println("Throws in exception");
        }

    }
}
