package com.java.Week12_OOP_Encapsulation;

import java.util.HashMap;
import java.util.Map;

public class CollectionsOfObjectsExercise2 {
    public static void main(String[] args) {

        Kitchen kitchen = new Kitchen();

        Veges tomato = new Veges("Tomato", "2023-06-24", "2023-06-30");
        Veges cucumber = new Veges("Cucumber", "2023-06-25", "2023-07-01");

        Fruits apple = new Fruits("Apple", "2023-06-24", "2023-07-01");
        Fruits banana = new Fruits("Banana", "2023-06-25", "2023-07-02");

        kitchen.addVegetable(tomato, 2.5);
        kitchen.addVegetable(cucumber, 1.8);
        kitchen.addFruit(apple, 3.0);
        kitchen.addFruit(banana, 2.0);

        // Print the inventory of vegetables in the Kitchen object
        System.out.println("Vegetable Inventory:");
        Map<Veges, Double> vegeInventory = kitchen.getVegesInventory();
        for (Map.Entry<Veges, Double> entry : vegeInventory.entrySet()) {
            Veges vege = entry.getKey();
            double weight = entry.getValue();
            System.out.println("- Name: " + vege.getName());
            System.out.println("  Weight: " + weight + " kg");
            System.out.println("  Arrival Time: " + vege.getArrivalTime());
            System.out.println("  Expire Date: " + vege.getExpireDate());
        }

// Print the inventory of fruits in the Kitchen object
        System.out.println("\nFruit Inventory:");
        Map<Fruits, Double> fruitInventory = kitchen.getFruitsInventory();
        for (Map.Entry<Fruits, Double> entry : fruitInventory.entrySet()) {
            Fruits fruit = entry.getKey();
            double weight = entry.getValue();
            System.out.println("- Name: " + fruit.getName());
            System.out.println("  Weight: " + weight + " kg");
            System.out.println("  Arrival Time: " + fruit.getArrivalTime());
            System.out.println("  Expire Date: " + fruit.getExpireDate());
        }

// Remove a vegetable and a fruit from the inventory
        kitchen.removeVegetable(tomato);
        kitchen.removeFruit(apple);

// Print the updated inventory of vegetables and fruits in the Kitchen object
        System.out.println("\nUpdated Vegetable Inventory:");
        vegeInventory = kitchen.getVegesInventory();
        for (Map.Entry<Veges, Double> entry : vegeInventory.entrySet()) {
            Veges vege = entry.getKey();
            double weight = entry.getValue();
            System.out.println("- Name: " + vege.getName());
            System.out.println("  Weight: " + weight + " kg");
            System.out.println("  Arrival Time: " + vege.getArrivalTime());
            System.out.println("  Expire Date: " + vege.getExpireDate());
        }

        System.out.println("\nUpdated Fruit Inventory:");
        fruitInventory = kitchen.getFruitsInventory();
        for (Map.Entry<Fruits, Double> entry : fruitInventory.entrySet()) {
            Fruits fruit = entry.getKey();
            double weight = entry.getValue();
            System.out.println("- Name: " + fruit.getName());
            System.out.println("  Weight: " + weight + " kg");
            System.out.println("  Arrival Time: " + fruit.getArrivalTime());
            System.out.println("  Expire Date: " + fruit.getExpireDate());
        }
    }
}

class Kitchen {
    private Map<Veges, Double> vegesInventory;
    private Map<Fruits, Double> fruitsInventory;

    public Kitchen() {
        this.vegesInventory = new HashMap<>();
        this.fruitsInventory = new HashMap<>();
    }

    public void addVegetable(Veges vege, double weight) {
        vegesInventory.put(vege, weight);
    }

    public void addFruit(Fruits fruit, double weight) {
        fruitsInventory.put(fruit, weight);
    }

    public void removeVegetable(Veges vege) {
        vegesInventory.remove(vege);
    }

    public void removeFruit(Fruits fruit) {
        fruitsInventory.remove(fruit);
    }

    public Map<Veges, Double> getVegesInventory() {
        return vegesInventory;
    }


    public Map<Fruits, Double> getFruitsInventory() {
        return fruitsInventory;
    }
}

class Veges {
    private String name;
    private final String arrivalTime;
    private final String expireDate;

    public Veges(String name, String arrivalTime, String expireDate) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getExpireDate() {
        return expireDate;
    }
}

class Fruits {
    private String name;
    private final String arrivalTime;
    private final String expireDate;

    public Fruits(String name, String arrivalTime, String expireDate) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.expireDate = expireDate;
    }

    public String getName() {
        return name;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public String getExpireDate() {
        return expireDate;
    }
}