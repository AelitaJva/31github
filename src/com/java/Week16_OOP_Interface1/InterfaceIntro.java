package com.java.Week16_OOP_Interface1;

public class InterfaceIntro {
    public static void main(String[] args) {
        Shape shape = new Rectangle();
        // List list = new ArrayList();
        // Map map = new HashMap();
        // Interface + polymorphism

        shape.calculateArea();
    }
}


interface Shape {
    // by default all methods in the interface are PUBLIC and ABSTRACT;
    // 1. You can declare them like in this way, start with void
    // 2. use IMPLEMENTS keyword to make a class to inherit interface
    // when we implement an interface the first concrete class
    // must override ALL ABSTRACT methods from the interface
    // 3. Interfaces are not instatiated.
    // 4. all variables in interface are constant -> public static final.
    // that's why you can't create an object with interface


    // when do you use an Abstract class vs Interface?
    // use Abstract -> when you want to create a parent class with common instance variables
    // and some instance methods & some abstract methods.
    // use Interface -> to create only abstract methods.

    public static final int i=30;
    void calculateArea ();
}

class Rectangle implements Shape {
    @Override
    public void calculateArea () {
        System.out.println(1+1);
    }
}