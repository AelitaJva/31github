package com.java.Week13_OOP_Inheritance;

public class ConstructorsInInheritanceExercise4 {
    public static void main(String[] args) {
        // Testing Person class
        Person person = new Person("John Doe", 25, 175.0, 70.0);
        System.out.println("Person Details:");
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Height: " + person.height);
        System.out.println("Weight: " + person.weight);
        System.out.println();
// tring name, int age, double height, double weight, String studentId, int gradeLevel, double GPA, String major
        // Testing Student class
//        Student student1 = new Student("Alice Smith", 20.00, 20.00, "S12345", 2, 3.8, "Computer Science");
//        System.out.println("Student Details:");
//        System.out.println("Name: " + student1.name);
//        System.out.println("Age: " + student1.age);
//        System.out.println("Height: " + student1.height);
//        System.out.println("Weight: " + student1.weight);
//        System.out.println("Student ID: " + student1.studentId);
//        System.out.println("Grade Level: " + student1.gradeLevel);
//        System.out.println("GPA: " + student1.GPA);
//        System.out.println("Major: " + student1.major);
//        System.out.println();

        // Testing Student class with default values
        Student student2 = new Student("Bob Johnson", 22);
        System.out.println("Student Details:");
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);
        System.out.println("Height: " + student2.height);
        System.out.println("Weight: " + student2.weight);
        System.out.println("Student ID: " + student2.studentId);
        System.out.println("Grade Level: " + student2.gradeLevel);
        System.out.println("GPA: " + student2.GPA);
        System.out.println("Major: " + student2.major);
    }
}

class Person {
    public String name;
    public int age;
    public double height;
    public double weight;

    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
}

class Student extends Person {
    String studentId;
    int gradeLevel;
    double GPA;
    String major;

    // Constructors
    public Student(String name, int age, double height, double weight, String studentId, int gradeLevel, double GPA, String major) {
        super(name, age, height, weight);
        this.studentId = studentId;
        this.gradeLevel = gradeLevel;
        this.GPA = GPA;
        this.major = major;
    }

    public Student(String name, int age, double height, double weight) {
        this(name, age, height, weight, "N/A", 0, 0, "N/A");
    }

    public Student(String name, int age, String studentId, int gradeLevel) {
        this(name, age, 0, 0, studentId, gradeLevel, 0, "N/A");
    }

    public Student(String name, int age) {
        this(name, age, 0, 0, "N/A", 0, 0, "N/A");
    }

    public Student() {
        this("N/A", 0, 0, 0, "N/A", 0, 0, "N/A");
    }
}