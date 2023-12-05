package com.java.Week12_OOP;

// only one public class

public class CheckingAccount {
    public long accountNumber;
    public int routingNumber;
    public String accountHolderName;
    public String address;

    // What is a constructor?
    // is  a part of the code that allows you
    // to create an object
    // EVERY CLASS HAS A CONSTRUCTOR
    // if you don't create a constructor explicitly.
    // then java adds a default constructor into your class.

    // what is the default constructor?
    // that has empty params


    // RUle5: Name is the same as that of "Class Name"
    public CheckingAccount() {
        // It's ok to write code inside constructor
        // it's kind working as a method
        System.out.println("Hello I'm constructor");
    }

    // Rule4: don't have return type (even void)
    // here it;s a method
//    public int/void CheckingAccount () {
//
//    }
}

class Main2 {
    public static void main(String[] args) {
        // whenever you call new keyword and name of the class
        // you actually calling that part of the class that called constructor

        // Rule1: initialize an Object
        // RUle2: can not be called like a method
        // RUle3: are called automatically asap objects gets created
        // Rule4: don't have return type (even void)
        // RUle5: Name is the same as that of "Class Name"
        // Rule6: Could accept parameters

        // Rule1: initialize an Object
        // RUle3: are called automatically asap objects gets created
        CheckingAccount var = new CheckingAccount();

        // RUle2: can not be called like a method
        // var.CheckingAccount();
    }
}
