package com.java.Week13_OOP_Inheritance;

public class ConstructorsInInheritanceExercise1 {
    public static void main(String[] args) {
        Building building = new Building("Warehouse");
        House house = new House("Cottage", 2, 2);
        Skyscraper skyscraper2 = new Skyscraper("Business Tower", 40, 15);

        System.out.println();
        System.out.println("Building1:");
        System.out.println("Name: " + building.getName());
        System.out.println("Floors: " + building.getFloors());
        System.out.println();


        System.out.println("House1:");
        System.out.println("Name: " + house.getName());
        System.out.println("Floors: " + house.getFloors());
        System.out.println("Bedrooms: " + house.getBedrooms());
        System.out.println();



        System.out.println("Skyscraper2:");
        System.out.println("Name: " + skyscraper2.getName());
        System.out.println("Floors: " + skyscraper2.getFloors());
        System.out.println("Elevators: " + skyscraper2.getElevators());
    }
}

class Building {
    private String name;
    private int floors;

    public Building (String name, int floors) {
        this.name = name;
        this.floors = floors;
    }

    public Building (String name) {
        this.name = name;
        floors = 1;
    }

    public String getName () {
        return name;
    }

    public int getFloors () {
        return floors;
    }
}

class House extends Building {
    private int bedrooms;

    public House (String name, int floors, int bedrooms) {
        super(name, floors);
        this.bedrooms = bedrooms;
    }

    public int getBedrooms () {
        return bedrooms;
    }
}

class Skyscraper extends Building {
    private int elevators;

    public Skyscraper (String name, int floors, int elevators) {
        super(name, floors);
        this.elevators = elevators;
    }

    public int getElevators () {
        return elevators;
    }
}