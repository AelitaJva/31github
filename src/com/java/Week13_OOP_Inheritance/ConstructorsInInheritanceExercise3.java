package com.java.Week13_OOP_Inheritance;

public class ConstructorsInInheritanceExercise3 {
    public static void main(String[] args) {
        Animal1 animal = new Animal1("Unknown");
        Mammal mammal = new Mammal("Horse", 4);
        Dog dog = new Dog("Canine", 4, "Buddy");

        System.out.println("Animal Species: " + animal.getSpecies());
        System.out.println();
        System.out.println("Mamal Species: " + mammal.getSpecies());
        System.out.println("Number of Legs: " + mammal.getNumOfLegs());
        System.out.println();
        System.out.println("Dog Species: " + dog.getSpecies());
        System.out.println("Dog of Legs: " + dog.getNumOfLegs());
        System.out.println("Dog Name: " + dog.getName());
    }
}

class Animal1 {
    String specifies;

    public Animal1 (String specifies) {
        this.specifies = specifies;
    }

    public String getSpecies () {
        return specifies;
    }
}

class Mammal extends  Animal1 {

    int numOfLegs;

    public Mammal (String specifies, int numOfLegs) {
        super(specifies);
        this.numOfLegs = numOfLegs;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }
}

class Dog extends  Mammal {


    String name;

    public Dog (String specifies, int numOfLegs, String name) {
        super(specifies, numOfLegs);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
