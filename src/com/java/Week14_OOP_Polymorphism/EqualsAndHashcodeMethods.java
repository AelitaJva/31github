package com.java.Week14_OOP_Polymorphism;

import java.util.Objects;

public class EqualsAndHashcodeMethods {
    public static void main(String[] args) {
        Person1 person1 = new Person1("Elon", 52);
        Person1 person2 = new Person1("Elon", 52);

        System.out.println(person1 == person2); // by default comparing if two obj same,
        // means both pointing to the same memory location.

        System.out.println(person1.equals(person2)); // by default comparing if two obj same,
        // means both pointing to the same memory location.
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int hashCode () {
        return Objects.hash(name, age);
    }

    // if the obj in the param has the instance var with the same value
    // of my current object (in main created obj)

    @Override
    public boolean equals (Object obj) {
//        if(this == obj) {
//            return true;
//        }
//
//        if(obj == null || getClass() != obj.getClass()) {
//            return false;
//        }

        // down casting
        // name & age -> are current object within class
        Person1 other = (Person1) obj;
        return Objects.equals(name, other.getName()) && age == other.getAge();
    }
}
