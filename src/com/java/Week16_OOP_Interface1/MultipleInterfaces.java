package com.java.Week16_OOP_Interface1;

public class MultipleInterfaces {
    public static void main(String[] args) {
        Product product = new OnlineProduct();
        Shipping product2 = new OnlineProduct();
        Payment product3 = new OnlineProduct();
        product.displayInfo(); // only one method visible bc the d.t is Product and it has only one method
        // d.t part decides what methods are available


        // class can implement multiple interface
        OnlineProduct product4 = new OnlineProduct();
        product4.calculateShipping();
        product4.processPayment();
        product4.displayInfo();
    }
}


interface Product {
    void displayInfo();
}

interface  Shipping {
    void calculateShipping();
}

interface Payment {
    void processPayment();
}



//class OnlineProduct extends  Product {}

class OnlineProduct implements Product, Shipping, Payment {

    @Override
    public void displayInfo() {

    }

    @Override
    public void calculateShipping() {

    }

    @Override
    public void processPayment() {

    }
}