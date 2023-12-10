package com.java.Week12_OOP_Encapsulation;

public class AmazonProduct {
    // AmazonProduct -> own custom data type, like String, double, int
    // instance variables => are characteristics of an object
    // properties of a class

    // instance variables are variables defined on clas level (scope).
    // they have default values.
    // decimal number data types have 0.0
    // boolean - false
    // all objects - null

    // instance var of amazon product
    String name;
    double price;
    String description;
}


// the purpose -> to run the program
class Main {
    public static void main(String[] args) {
        // class is a blueprint
        // first AmazonProduct OBJECT
        // creation of object:
        AmazonProduct iphone14 = new AmazonProduct();

        // using the instance variables
        // give the values to that properties created in class
        // initialization of instance var:
        iphone14.name = "iphone14";
        iphone14.price = 999.99;
        iphone14.description = "Iphone14 Max";

        System.out.println(iphone14.name);
        System.out.println(iphone14.price);
        System.out.println(iphone14.description);

        AmazonProduct iphone14Pro = new AmazonProduct();
        iphone14Pro.name = "GooglePixel";
        iphone14Pro.price = 599.99;
        iphone14Pro.description = "Google it";

        System.out.println(iphone14Pro.name);
        System.out.println(iphone14Pro.price);
        System.out.println(iphone14Pro.description);

        // instance var has own default values
        // when you create an object all properties will
        // get default values first
        // only when you changed it to particular value will changed
        AmazonProduct var = new AmazonProduct();
        System.out.println(var.name);
        System.out.println(var.price);
    }
}
