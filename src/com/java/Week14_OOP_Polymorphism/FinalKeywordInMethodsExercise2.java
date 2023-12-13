package com.java.Week14_OOP_Polymorphism;

public class FinalKeywordInMethodsExercise2 {
    public static void main(String[] args) {
        CementBag cementBag1 = new CementBag("Generic Cement", 7.99);
        ConcreteMix concreteMix1 = new ConcreteMix("StrongMix", 14.99, "Grade A");
        ConcreteMix concreteMix2 = new ConcreteMix("SuperStrength", 19.99, "Grade B");

// Display information using displayInfo() method
        cementBag1.displayInfo();
        concreteMix1.displayInfo();
        concreteMix2.displayInfo();
        cementBag1.use();
        concreteMix1.use();
        concreteMix2.use();
    }
}


class CementBag {

    String productName;
    double price;

    public CementBag(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void displayInfo () {
        System.out.println("Brand: " + productName);
        System.out.println("Price per Bag: $" + price);
    }

    public final void use () {
        System.out.println("Usage instructions: Mix with water and other materials for construction.");
    }
}

class ConcreteMix extends  CementBag {
    String grade;

    public ConcreteMix (String productName, double price, String  grade) {
        super(productName, price);
        this.grade = grade;
    }

    @Override
    public void displayInfo () {
        super.displayInfo();
        System.out.println("Strength Grade: " + grade);
    }
}