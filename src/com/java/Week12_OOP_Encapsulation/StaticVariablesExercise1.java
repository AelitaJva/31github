package com.java.Week12_OOP_Encapsulation;

public class StaticVariablesExercise1 {
    public static void main(String[] args) {

        // Accessing static variables and methods
        System.out.println("Total headphones created: " + Headphone.getTotalHeadphones());
        Headphone.setManufacturer("ABC Electronics");

// Creating instances of the Headphone class
        Headphone headphone1 = new Headphone();  //totalHeadphones should be incremented.
        headphone1.setModel("Model X");
        headphone1.setPrice(99.99);
        headphone1.setColor("Black");
        headphone1.setWireless(true);

        Headphone headphone2 = new Headphone();  //totalHeadphones should be incremented.
        headphone2.setModel("Model Y");
        headphone2.setPrice(79.99);
        headphone2.setColor("White");
        headphone2.setWireless(false);

// Accessing instance methods
        System.out.println("Headphone 1 Details:"); headphone1.displayDetails();
        System.out.println("Headphone 2 Details:"); headphone2.displayDetails();

// Accessing static variables after creating instances
        System.out.println("Total headphones created: " + Headphone.getTotalHeadphones());
    }
}

class Headphone {
    private static String manufacturer = "Unknown";
    private static int totalHeadphones = 0;
    private String model;
    private double price;
    private String color;
    private boolean isWireless;

    public Headphone () {
        totalHeadphones++;
    }


    // static getter
    public static int getTotalHeadphones () {
        return totalHeadphones;
    }

    // static setter calling the class name itself rather than instaces
    public static void setManufacturer (String manufacturer) {
        Headphone.manufacturer = manufacturer;
    }


    public void displayDetails () {
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Wireless: " + isWireless);
    }


    public void setModel (String model) {
        this.model = model;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setWireless (boolean isWireless) {
        this.isWireless = isWireless;
    }

}
