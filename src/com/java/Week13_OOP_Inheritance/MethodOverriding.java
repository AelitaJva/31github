package com.java.Week13_OOP_Inheritance;

public class MethodOverriding {
    public static void main(String[] args) {
        Dog2 dog2 = new Dog2();
        dog2.makeSound();
        dog2.eat();
        dog2.getNumberOfLegs();

        System.out.println();


        Animal2 animal2 = new Animal2();
        animal2.makeSound();
    }
}

class Animal2 {

    public void getNumberOfLegs () {
        System.out.println("4 legs");
    }

    public void eat() {
        System.out.println("Eating ...");
    }
    public void makeSound () {
        System.out.println("Animal makes a sound");
    }
}

class Dog2 extends  Animal2 {
    // rules of overriding:
    // 1. method signature must be the same as parent method and as subclass
    // 2. public,protected - no restrictive m.a, NOT : private
    // 3. can get this method only with inheritance
    // 4. return type must be the same as parent class
    // 5. it's optional to put @Override annotation
    public void makeSound () {
        System.out.println("Bark bark");
    }
}
