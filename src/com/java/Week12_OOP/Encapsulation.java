package com.java.Week12_OOP;

// ENCAPSULATION
public class Encapsulation {
    public static void main(String[] args) {
        ChaseCheckingAccount c1 = new ChaseCheckingAccount("Aelita", "1212344",
                123271978, 1000000.00);

//        System.out.println(c1.acountNum);
//        c1.acountNum = "00000000000";
//        System.out.println(c1.acountNum);


        System.out.println(c1.getRoutingNum());
        System.out.println(c1.getAccountNum());
        System.out.println(c1.getBalance());
        System.out.println(c1.getName());

        c1.setAccountNum("000000000");
        System.out.println(c1.getAccountNum());

        c1.setBalance(2000000.00);
        System.out.println(c1.getBalance());

        c1.setBalance(-1000.00);
        System.out.println(c1.getBalance());

        c1.setRoutingNum(85188817);
        System.out.println(c1.getRoutingNum());

    }
}

class ChaseCheckingAccount {
    // make all of your instance var private, we hide them
    private String name;

    // making instance var private makes sure you can not access those variables to read or modify it's
    // values outside of the current class
    private String accountNum;
    private int routingNum;
    private double balance;

    public ChaseCheckingAccount(String name, String accountNum, int routingNum, double balance) {
        this.name = name;
        this.accountNum = accountNum;
        this.routingNum = routingNum;
        this.balance = balance;
    }

    // Getter and Setter methods
    // getter method helps you read teh values of private instance var
    // setter method helps you update teh value of your private instance var
    // each instance var should have a getter and a setter most of times
    // getter and setter method always must be public


    // GETTER
    public String getAccountNum() {
        return accountNum;
    }

    public int getRoutingNum() {
        return routingNum;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // SETTER - helps you update the private instance variables
    // setter method must be VOID
    // must have 1 param with the same d.t as the instance variable
    // using the SETTER  up on requirement, you can't extra logic and assign unwanted logic
    // every data you trying to assign only based on business requirement
    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    // it's only updated if the requirements are matched
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Negative values can't be assigned to the balance");
        }
    }

    public void setRoutingNum (int routingNum) {
        if(routingNum == 123271978 || routingNum == 85188817) {
            this.routingNum = routingNum;
        } else {
            System.out.println("Routing number is outside of the bank");
        }
    }
}
