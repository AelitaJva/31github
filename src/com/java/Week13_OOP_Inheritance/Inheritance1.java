package com.java.Week13_OOP_Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(1234567890, 34.00);
        account.setBalance(20);
        System.out.println(account.getBalance());

        //System.out.println(account.getAccountNumber());
        account.deposit(5000);
        System.out.println(account.getBalance());

        account.withdraw(2345);
        System.out.println(account.getBalance());

        CheckingAccount account2 = new CheckingAccount(666.88, 14567890, 15.00);
        System.out.println(account2.getBalance());
        System.out.println(account2.getAccountNumber());


        System.out.println();

        System.out.println(account.getMonthlyFee());
        account.applyMonthlyFee();
        System.out.println(account.getBalance());

        System.out.println(account2.getMonthlyFee());
        account2.applyMonthlyFee();
        System.out.println(account2.getBalance());




    }
}


// super class
// when you do the var as a private: use encapsulation: set & get methods
// when you have public you can directly access the balance
// public, private, default access modifiers
class BankAccount {
    private double balance;
    private final long accountNumber;

    public BankAccount (long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BankAccount (double balance, long accountNumber) {
        // or use this -> this.accountNumber = accountNumber;
        this(accountNumber);

        this.balance = balance;

    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber () {
        return accountNumber;
    }

    public void withdraw (double amount) {
        balance-=amount;
    }

    public void deposit (double amount) {
        balance+=amount;
    }

}


// sub-class
// sub-class has to extend the parent class using extends keyword
// now they're related
// when a class extends from another class
// the sub-class inherits all public and default instance variables
// and public and default methods

class CheckingAccount extends BankAccount {
    private double monthlyFee;

    public CheckingAccount (long accountNum, double monthlyFee) {
        super(accountNum);
        this.monthlyFee = monthlyFee;
    }

    public CheckingAccount (double balance, long accountNum, double monthlyFee) {
        super(balance, accountNum);
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void applyMonthlyFee () {
        // you can call public methods from parent class

        withdraw(monthlyFee);
    }
}
