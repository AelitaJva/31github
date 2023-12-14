package com.java.Week15_OOP_Abstraction;

public class MultiLevelAbstraction {
    public static void main(String[] args) {
        Product phone = new Electronics("Phone", 999.99, "Ipone");
        Books books = new Books("Novel", 999.33, "Walter Isaacson");

        phone.getProductInfo();
        books.getProductInfo();

        System.out.println(phone.getProductType());
        System.out.println(books.getProductType());

        System.out.println(phone.calculateShippingCost());
        System.out.println(books.calculateShippingCost());


    }
}


abstract class ShippingProvider {
    // different shipping cost for different products

    public abstract double calculateShippingCost();

}

abstract class Product extends ShippingProvider {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // abstract method : purpose -> will be different for each product
    public abstract String getProductType();


    // concrete method : purpose -> will be same for all products
    public void getProductInfo() {
        System.out.println("Product Name: " + name);
        System.out.println("Product Price: " + price);
    }
}

// concrete class - first non-abstract class
class Electronics extends Product {
    private String brand;

    public Electronics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public double calculateShippingCost() {
        return 10.0;
    }

    @Override
    public String getProductType() {
        return "Electronics";
    }
}

class Books extends Product {
    private String author;

    public Books(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public double calculateShippingCost() {
        return 3.8;
    }

    @Override
    public String getProductType() {
        return "Books";
    }
}