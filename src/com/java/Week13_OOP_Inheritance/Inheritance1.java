package com.java.Week13_OOP_Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.setBalance(20);
        System.out.println(account.getBalance());
    }
}


// super class
// when you do the var as a private: use encapsulation: set & get methods
// when you have public you can directly access the balance
// public, private, default access modifiers
class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }



}


// sub-class
// sub-class has to extend the parent class using extends keyword
// now they're related
// when a class extends from another class
// the sub-class inherits all public and default instance variables
// and public and default methods

class CheckingAccount extends BankAccount {
}
