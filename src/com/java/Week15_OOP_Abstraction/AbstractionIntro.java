package com.java.Week15_OOP_Abstraction;

public class AbstractionIntro {
    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        a.makeSound();
        b.makeSound();
    }
}

// 1. by setting class abstract u can't create obj from parent class
// you can just create instances from subclasses
// 2. And still have an ability to call methods from this type of obj creation definitions
// 3.

// 1. when you want to restrict the ability to create
// objects from parent class
// abstract class can not be instantiated.
// the whole purpose of the Abstract class
// is to serve as a parent class that stores all
// common behaviors and properties.


// 2. when you want to create a method in the parent class
// to enable polymorphism
// and you know that every single child class MUST override that method logic
// you can declare methods abstract.

abstract class Animal {

    // Abstract methods are methods that can only be declared in Abstract class or interface
    // abstract methods don't have a body.
    // abstract methods are meant to be overridden in concrete - subclasses
    public abstract void makeSound ();

}


// if the subclass is extending an abstract class that has abstract methods
// the concrete subclass must override all inherited abstract methods.
// otherwise, the code doesn't compile

class Dog extends  Animal {
    @Override
    public void makeSound () {
        System.out.println("Woof!");
    }
}

class Cat extends  Animal {
    @Override
    public void makeSound () {
        System.out.println("Meow!");
    }
}