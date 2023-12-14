package com.java.Week16_OOP_Interface1;

public class DefaultMethodsInInterface {
    public static void main(String[] args) {
        BankingTransaction withdraw = new WithdrawTransaction();
        BankingTransaction deposit = new DepositTransaction();

        // runtime polymorphism
        withdraw.execute();
        withdraw.logTransaction();

        System.out.println();

        deposit.execute();
        deposit.logTransaction();
    }
}


interface BankingTransaction {
    void execute();

    // one method can implemented with the logic that subclasses can override
    // yes, it is flexible method, you can change the logic if you want
    public default void logTransaction() {
        System.out.println("Logging transaction ...");
    }
}

class WithdrawTransaction implements BankingTransaction {
    @Override
    public void execute() {
        System.out.println("Performing withdraw transaction");
    }
}

class DepositTransaction implements BankingTransaction {
    @Override
    public void execute() {
        System.out.println("Performing deposit transaction");
    }
}