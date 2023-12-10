package com.java.Week13_OOP_Inheritance;

public class Inheritance1Exercise1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4);
        car.start();
        car.drive();
        car.stop();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", true);
        motorcycle.start();
        motorcycle.ride();
        motorcycle.stop();
    }
}

class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Starting the " + brand);
    }

    public void stop() {
        System.out.println("Stopping the " + brand);
    }
}

class Car extends Vehicle {

    private int numOfDoors;

    public Car(String brand, int numOfDoors) {
        super(brand);
        this.numOfDoors = numOfDoors;
    }

    public void drive() {
        System.out.println("Driving the " + brand + " with " + numOfDoors + " doors");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String brand, boolean hasSidecar) {
        super(brand);
        this.hasSidecar = hasSidecar;
    }

    public void ride() {
        System.out.println("Riding the " + brand +" with " + "a sidecar");
    }


}

