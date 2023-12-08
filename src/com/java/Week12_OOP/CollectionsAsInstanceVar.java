//package com.java.Week12_OOP;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class CollectionsAsInstanceVar {
//    public static void main(String[] args) {
//       Employee emp1 = new Employee("Elon", 52, "Executive", 1000.00);
//        System.out.println(emp1.getProjects());
//
//        emp1.addProject("Tesla");
//        System.out.println(emp1.getProjects());
//
//        emp1.addProject("SpaceX");
//        System.out.println(emp1.getProjects());
//
//        emp1.addProject("BoringCompany");
//        emp1.addProject("NeuroLink");
//        emp1.addProject("Twitter");
//
//
//
//        System.out.println(emp1.getProjects());
//    }
//
//    // now a single var emp1 = stores the following inof
//    // Employee {
//    // name : "Elon"
//    // age: 52;
//    // department: "Executive"
//    // salary: 10000.00
//    // projects: [Tesla, SpaceX, BoringCompany, NeuroLink, Twitter]
//    // }
//}
//
//
//class Employee {
//
//    private String name;
//    private int age;
//    private String department;
//    private double salary;
//    private List<String> projects = new ArrayList<>();
//
//    public Employee(String name, int age, double department) {
//        this.name = name;
//        this.age = age;
//        this.department = department;
//        this.salary = salary;
//    }
//
//    public Employee(String name, int age, String department, double salary, List<String> projects) {
//        this(name, age, department, salary); // constructor overloading, + constrictor chaining (this();)
//        this.projects = projects;
//    }
//
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public List<String> getProjects () {
//        return projects;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void addProject (String projectName) {
//        projects.add(projectName);
//    }
//
//
//
//
//}