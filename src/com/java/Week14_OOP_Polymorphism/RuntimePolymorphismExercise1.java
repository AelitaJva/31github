package com.java.Week14_OOP_Polymorphism;

public class RuntimePolymorphismExercise1 {
    public static void main(String[] args) {
        System.out.println("Testing cookFood() method:");
        Cook chef = new Chef("Pasta", 90);
        chef.cookFood();

        Cook baker = new Baker("Cake", 180);
        baker.cookFood();
    }
}

class Cook {
    String name;
    int time;

    public Cook(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public void cookFood() {
        System.out.println("Cooking " + name + " for " + time + " minutes.");
    }
}

class Chef extends Cook {
    public Chef(String name, int time) {
        super(name, time);
    }

    @Override
    public void cookFood() {
        this.name = "Pasta";
        this.time = 90;
        System.out.println("Chef's dish: " + name + ", Time: " + time);
    }
}

class Baker extends Cook {
    public Baker(String name, int time) {
        super(name, time);
    }

    @Override
    public void cookFood() {
        this.name = "Cake";
        this.time = 180;
        System.out.println("Chef's dish: " + name + ", Time: " + time);

    }
}