package com.java.Week14_OOP_Polymorphism;

public class RuntimePolymorphism {
    // first check if the data type class
    // contains the method you are trying to call
    // if it doesn't your code is not going to compile

    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        // you calling the object and storing it in parent data type
        // left side stays as a parent class = but right side is new object
        Animal b = new Cat();
        b.makeSound();
    }
}


class Animal {
    public void makeSound () {
        System.out.println("Parent class");
    }
}

class Cat extends  Animal {
    @Override
    public void makeSound () {
        System.out.println("Moow!");
    }
}

class Dog extends  Animal {
    @Override

    public void makeSound () {
        System.out.println("Woof!");
    }
}