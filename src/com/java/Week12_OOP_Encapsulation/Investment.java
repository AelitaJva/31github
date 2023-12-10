package com.java.Week12_OOP_Encapsulation;

class Investment {
    public String investmentId;
    public String investmentName;
    public double initialInvestment;
    public double currentValue;
    public boolean isProfitable;


    public Investment () {

    }

    public Investment (String id, String name, double initial, double current, boolean isProfitableParam) {
        investmentId = id;
        investmentName = name;
        initialInvestment = initial;
        currentValue = current;
        isProfitable = isProfitableParam;
    }
}
