package com.java.Week12_OOP_Encapsulation;


// T: CONSTRUCTOR WITH MULTIPLE PARAMS
 class SavingAccount {
    public long accountNum;
    public String accountHolderName;
    public double balance;

    // constructors with params are used to initialize the values of instances var
    public SavingAccount(long num, String name, double b) {
        accountNum = num;
        accountHolderName = name;
        balance = b;
    }

    public SavingAccount () {

    }
}


class Main3 {
    public static void main(String[] args) {
        // Consturctor with default value
        SavingAccount var = new SavingAccount();
        var.accountNum = 1234556666l;
        var.accountHolderName = "John Doe";
        var.balance = 1788800.0;

        System.out.println(var.accountNum);
        System.out.println(var.accountHolderName);
        System.out.println(var.balance);

        SavingAccount var2 = new SavingAccount(4444444l, "Elon Musk", 679345.90);
        System.out.println(var2.accountNum);
        System.out.println(var2.accountHolderName);
        System.out.println(var2.balance);

    }
}
