package com.java.Week12_OOP_Encapsulation;

public class InstanceVsStaticMethods {
    public static void main(String[] args) {

        // each object is independent, so don't effect each other
        // first object
        BankAccount ba = new BankAccount("ABC123");
        ba.deposit(400);
        ba.deposit(200);
        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getBalance());

        ba.withdraw(150);
        System.out.println(ba.getBalance());


        // second object
        BankAccount ba2 = new BankAccount("DEF5555");
        ba2.deposit(100008);
        System.out.println(ba2.getAccountNumber());
        System.out.println(ba2.getBalance());

        ba2.withdraw(5005);
        System.out.println(ba2.getBalance());


        // with static u deal only with the Class itself
        // is not belongs to any of the object
        // to call this method, we don't need to create an object, just call the class name itself first
        // the use of static method is to build the reusable methods
        double interest = BankAccount.calculateInterest(1000, 0.05, 2);
        System.out.println(interest);
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    // instance methods are methods that belong to a specific instance
    // of a class. It means it belongs to an object
    // instance methods are declared without the static keyword
    // instance methods can access instance variables.
    // to access(invoke, call) the instance methods
    // we first have to create an object
    // create once, and gives multiple answers based on the number of objects

    // method manipulates the state of your object/instance var - instance methods

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    // static method
    public static double calculateInterest(double principal, double rate, int years) {
        double interest = principal * rate * years;
        return interest;
    }
}
