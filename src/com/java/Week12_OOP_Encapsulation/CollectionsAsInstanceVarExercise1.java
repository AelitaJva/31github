package com.java.Week12_OOP_Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class CollectionsAsInstanceVarExercise1 {
    public static void main(String[] args) {
        List<String> accountHolders = new ArrayList<>();
        accountHolders.add("John Doe");
        accountHolders.add("Jane Smith");
        accountHolders.add("Ael Smith");
        Account account = new Account("1234567890", accountHolders);

        account.addTransaction(1000);
        account.addTransaction(-500);
        account.addTransaction(200);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holders: " + account.getAccountHolders());
        System.out.println("Transactions : " + account.getTransactions());
        System.out.println("Balance : " + account.getBalance());

        System.out.println("Has Account Holder 'John Doe': " + account.hasAccountHolder("John Doe"));

        System.out.println("Has Account Holder 'Alice Smith': " + account.hasAccountHolder("Alice Smith"));
        System.out.println("The bank name: " + Account.bankName);
        System.out.println("Total amount of account: " + Account.totalAccounts);
    }
}

class Account {
    static final String bankName = "XYZ Bank";
    static int totalAccounts = 0;

    String accountNumber;
    List<String> accountHolders;
    List<Double> transactions;

    public Account(String accountNumber, List<String> accountHolders) {
        this.accountNumber = accountNumber;
        this.accountHolders = new ArrayList<>(accountHolders);
        this.transactions = new ArrayList<>();
        totalAccounts++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public List<String> getAccountHolders() {
        return accountHolders;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(double amount) {
        transactions.add(amount);
    }

    public double getBalance() {
        double currentBalance = 0.0;
        for (double transaction : transactions) {
            currentBalance += transaction;
        }

        return currentBalance;
    }

    public boolean hasAccountHolder(String accountHolder) {
        return accountHolders.contains(accountHolder);
    }
}
