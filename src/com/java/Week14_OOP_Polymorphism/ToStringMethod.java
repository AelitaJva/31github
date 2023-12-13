package com.java.Week14_OOP_Polymorphism;

public class ToStringMethod {
    public static void main(String[] args) {
        Person person = new Person("Elon", 52);
        // Instead using this get and set multiple time, and write small code
//        System.out.println(person.getAge());
//        System.out.println(person.getName());


        // System.out.println(person.toString());
        // Internally - println() method calls the toString method of the obj
        System.out.println(person);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
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
        return "name: " + name + " \nage: " + age;
    }
}
