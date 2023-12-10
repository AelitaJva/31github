package com.java.Week12_OOP_Encapsulation;

// 3 diff constructors using the this(); keyword with diff params

public class ConstructorChanging {
    public static void main(String[] args) {
        StudentCheckingAccount sc = new StudentCheckingAccount("Elon Musk",
                1000000.00, "12345759347346", 342434);

        StudentCheckingAccount sc2 = new StudentCheckingAccount("Bill Gates",
                "63089526", 223232323);

        System.out.println(sc2.studentName);
        System.out.println(sc2.balance);

        StudentCheckingAccount sc3 = new StudentCheckingAccount("Aelita Jelden", "2103.03026");
        System.out.println(sc3.studentName);
        System.out.println(sc3.accountNum);
        System.out.println(sc3.routingNum);
    }
}


class StudentCheckingAccount {
    public String studentName;
    public double balance;
    public String accountNum;
    public int routingNum;


    public StudentCheckingAccount(String studentName, double balance,
                                  String accountNum, int routingNum) {
        this.studentName = studentName;
        this.balance = balance;
        this.accountNum = accountNum;
        this.routingNum = routingNum;
    }

//    public StudentCheckingAccount (String studentName, String accountNum, int routingNum) {
//        this.studentName = studentName;
//        this.accountNum = accountNum;
//        this.routingNum = routingNum;
//    }

    // this(); -> this with parenthesis
    // what is the difference between this and this(); keywords in java?
    // this(); helps you access the other constructors in this class
    // this keyword enables you to use constructor chaining
    // constructor chaining is when you are calling one constructor from another;


    // set default value of that not existing param
    // ex: double balance = 0.0;
    public StudentCheckingAccount(String studentName, String accountNum, int routingNum) {
        this(studentName, 0.0, accountNum, routingNum);
    }

    /// here you can call 1st and 2nd cons, but it's good idea
    // to call cons which has less params has

    public StudentCheckingAccount(String studentName, String accountNum) {
        this(studentName,  accountNum, 0);
    }




}