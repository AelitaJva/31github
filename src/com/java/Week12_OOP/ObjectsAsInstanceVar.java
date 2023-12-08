package com.java.Week12_OOP;

import java.util.ArrayList;
import java.util.List;

public class ObjectsAsInstanceVar {
    public static void main(String[] args) {

        Address c1Address = new Address("Asanbay 38", "Bishkek", 678, "KG");
        Address c2Address = new Address("Osh Bazaar", "Bishkek", 684, "KG");
        Address c3Address = new Address("Alamedin Bazaar", "Bishkek", 123, "KG");
        // create accounts for John Do
        Account2 johnDoChecking = new Account2("123456", 24444);
        Account2 johnDoSavings = new Account2("57923463", 47852649);
        List<Account2> johnDoAccounts = new ArrayList<>();
        johnDoAccounts.add(johnDoSavings);
        johnDoAccounts.add(johnDoChecking);


        Account2 elonChecking = new Account2("32507234", 342795);
        Account2 elonSavings = new Account2("57408957", 47563249);
        List<Account2> elonAccounts = new ArrayList<>();
        elonAccounts.add(elonChecking);
        elonAccounts.add(elonSavings);

        Account2 jesikaChecking = new Account2("8547342", 580324);
        Account2 jesikaSavings = new Account2("42325234", 53408637);
        Account2 jesikaSavings2 = new Account2("43225787654", 123456789);
        List<Account2> jesikaAccounts = new ArrayList<>();
        jesikaAccounts.add(jesikaChecking);
        jesikaAccounts.add(jesikaSavings);
        jesikaAccounts.add(jesikaSavings2);


        Customer c1 = new Customer("John Do", c1Address, johnDoAccounts);
        Customer c2 = new Customer("Elon Musk", c2Address, elonAccounts);
        Customer c3 = new Customer("Jesika Alba", c3Address, jesikaAccounts);

        List<Customer> customerList = new ArrayList<>();
        customerList.add(c1);
        customerList.add(c2);
        customerList.add(c3);


        // one bank with list of customers, where each customer has a list of accounts
        Bank chaseBank = new Bank("Chase", customerList);

//        System.out.println(chaseBank.getName());
//
//        List<Customer> cList = chaseBank.getCustomerList();
//        for (Customer obj : cList) {
//            if (obj.getName().equalsIgnoreCase("elon musk")) {
//                System.out.println(obj.getName());
//                System.out.println(obj.getAddress().getStreet());
//                System.out.println(obj.getAddress().getCity());
//                System.out.println(obj.getAddress().getZipcode());
//                System.out.println(obj.getAddress().getCity());
//            }
//        }


        printAllAccounts(chaseBank);

    }

    // create a method that will print out all accounts of all customer

    public static void printAllAccounts (Bank bank) {
        List<Customer> customerList = bank.getCustomerList();

        for(Customer customerObj : customerList) {
            System.out.println(customerObj.getName());
            List<Account2> account2List = customerObj.getAccount2s();

            for(Account2 account2Obg : account2List) {
                System.out.println("Account number: " + account2Obg.getAccountNumber());
                System.out.println("Account balance: " + account2Obg.getBalance());
            }
        }
    }
}

// I want to store information about Bank
// Bank should have the following information:
// Bank {
// name : "Chase";
// customers : [{Aelita Jelden}, {Adelina Talant}, {Albina Askar}];
// }


class Customer {

    private String name;

    private Address address;
    private List<Account2> account2s;

    public Customer(String name, Address address, List<Account2> account2s) {
        this.name = name;
        this.address = address;
        this.account2s = account2s;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Account2> getAccount2s() {
        return account2s;
    }

    public void setAccount2s(List<Account2> account2s) {
        this.account2s = account2s;
    }
}

class Address {

    private String street;
    private String city;
    private int zipcode;
    private String country;

    public Address(String street, String city, int zipcode, String country) {
        this.street = street;
        this.city = city;
        this.zipcode = zipcode;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

class Bank {


    private String name;
    private List<Customer> customerList;

    public Bank(String name, List<Customer> customerList) {
        this.name = name;
        this.customerList = customerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}

class Account2 {

    private String accountNumber;
    private double balance;

    public Account2(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}