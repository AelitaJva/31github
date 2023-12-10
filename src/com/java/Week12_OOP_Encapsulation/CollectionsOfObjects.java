package com.java.Week12_OOP_Encapsulation;

import java.util.ArrayList;
import java.util.List;

public class CollectionsOfObjects {
    public static void main(String[] args) {
        // open the list of object first
        // create multiple objects of class
        // add all objects to the list

        // 1.
        List<BankingAccount> allAccounts = new ArrayList<>();


        BankingAccount ba1 = new BankingAccount("Chase", 245697);
        BankingAccount ba2 = new BankingAccount("BOA", 475927523);
        BankingAccount ba3 = new BankingAccount("US Bank", 1234567);
        BankingAccount ba4 = new BankingAccount("Chase", 245697);


        // 2.
        allAccounts.add(ba1);
        allAccounts.add(ba2);
        allAccounts.add(ba3);
        System.out.println(allAccounts);


        // 3.
        for (BankingAccount obj : allAccounts) {
            if (obj.getName().equalsIgnoreCase("chase")) {
                System.out.println(obj.getName());
            }
        }

        long result = BankingAccount.calculateTotalBalanceOfAllAccount(allAccounts);
        System.out.println(result);
        // in collectionsOfObjects class create a static method called calculateTotalBalanceOfAllAccount
        // that takes a list of BankingAccounts as a param
        // and it sums up balance of every account
        // and return the total balance of all accounts

    }


}

// no classes with duplicated names within the same package
// POJO - plain old java object (get, set methods)
// creating object store the data
class BankingAccount {

    private String name;
    private double balance;

    public BankingAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static long calculateTotalBalanceOfAllAccount(List<BankingAccount> allAccounts) {
        long totalBalanceOfAllAccounts = 0;

        for (BankingAccount account : allAccounts) {
            totalBalanceOfAllAccounts += account.getBalance();
        }
        return totalBalanceOfAllAccounts;
    }


}