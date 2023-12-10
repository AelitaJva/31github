package com.java.Week13_OOP_Inheritance;

class ConstructorsInInheritance {
    public static void main(String[] args) {

        Subclass obj = new Subclass();
        System.out.println();

        Subclass obj2 = new Subclass(2, "Hey");

        System.out.println();

        Subclass obj3 = new Subclass("Hey");




    }
}

// 1. every class has implicit default constructor with no arguments
// without constructor there is no way to create obj or class
class Superclass {
    public Superclass () {
        System.out.println("default con from parent class");
    }

    public Superclass (int a, String b) {
        System.out.println("two params cons from parent class: " + a + " " + b);
    }

    public Superclass (String b) {
        System.out.println("one param cons from parent class: " + b);

    }
}

// 1. the first statement in a cons must be
// a call to a parent cons

// 2. this(); -> is used to call other cons within the same class
//    super();-> is used to  call parent cons

class Subclass extends  Superclass {

    // 2. default cons have an implicit call to
    // default cons of a parent class

    // when you don't have a default cons in the parent class
    // u must call a cons with parameters explicitly.
    public  Subclass () {
        System.out.println("default con from sub class");
    }

    public Subclass (int a, String b) {
        System.out.println("tow params cons from sub class: " + a + " " +  b);
    }

    public Subclass (String b) {
        super(2, b);
        System.out.println("one params cons from sub class: " + b);
    }
}