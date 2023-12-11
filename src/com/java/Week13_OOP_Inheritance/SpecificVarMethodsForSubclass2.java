package com.java.Week13_OOP_Inheritance;

public class SpecificVarMethodsForSubclass2 {
    public static void main(String[] args) {
        SavingAccount savingsAccount = new SavingAccount("SA123", 1000.0, 5.0);
        savingsAccount.calculateInterest();

        CheckingAccount2 checkingAccount = new CheckingAccount2("CA456", 500.0, 200.0);
        checkingAccount.withdrawWithOverdraft(700.0);
    }
}


class BankAccount2 {
    protected String accountNumber;
    protected double balance;

    public BankAccount2(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Initial balance for " + getAccountNumber() + " is " + getBalance());
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Top us " + getAccountNumber() + " for " + amount + getBalance() + " available");
    }

    public void withdraw(double amount) {
        if(balance >= amount) {
            balance -= amount;
            System.out.println("Available balance for " + getAccountNumber() + " is " + getBalance());
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends  BankAccount2 {
    private double interestRate;

    public SavingAccount (String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest () {
        double interest = balance * interestRate / 100;
        super.deposit(interest);
    }
}

class CheckingAccount2 extends BankAccount2 {
    double overdraftLimit;

    public CheckingAccount2 (String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdrawWithOverdraft (double amount) {
        double availableFunds = balance + overdraftLimit;
        if(amount <= availableFunds) {
            balance-=amount;
            System.out.println("Balance for " + getAccountNumber() + " is " + getBalance());
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
