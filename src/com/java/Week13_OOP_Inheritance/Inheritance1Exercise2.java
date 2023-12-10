package com.java.Week13_OOP_Inheritance;

public class Inheritance1Exercise2 {
    public static void main(String[] args) {
        Employee employee = new Employee("John", "E123", 50000);
        Manager manager = new Manager("John", "M456", 80000, "IT");
        Developer developer = new Developer("Jane Smith", "D789", 115000, "Java");

        employee.displayDetails();
        System.out.println();

        manager.displayDetails();
        manager.manageTeam();
        System.out.println();

        developer.displayDetails();
        developer.writeCode();
    }
}


class Employee {
    protected String name;
    protected String employeeId;
    protected double salary;

    public Employee (String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails () {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee{
    private String department;

    public Manager (String name, String employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public void manageTeam () {
        System.out.println(name + " is managing the " + department + " team");
    }
}

class Developer extends Employee{
    private String programmingLanguage;

    public Developer (String name, String employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public void writeCode () {
        System.out.println(name + " is writing code in " + programmingLanguage);
    }
}
