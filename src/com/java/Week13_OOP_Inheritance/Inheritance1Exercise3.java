package com.java.Week13_OOP_Inheritance;

public class Inheritance1Exercise3 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Jery");
        cat.setAge(2);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());

        cat.makeSound();
    }
}

class Animal {

    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be less than 0.");
        }
    }

    public void makeSound() {
        System.out.println(name + " and at the age " + age + " makes a sound.");
    }
}

class Cat extends Animal {

}