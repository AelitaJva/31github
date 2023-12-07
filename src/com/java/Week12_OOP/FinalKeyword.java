package com.java.Week12_OOP;

public class FinalKeyword {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        System.out.println(c.calculateCircumference());
    }
}

class Circle {
    // final keyword can be used with variables, classes, methods
    // final keyword with variables allows the value of the var
    // to be assigned only once.
    private final double PI = 3.14159;
    private double radius;  // undefined;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        // !!!  PI = 6;
        return 2 * PI * radius;
    }
}