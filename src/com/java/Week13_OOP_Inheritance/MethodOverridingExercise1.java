package com.java.Week13_OOP_Inheritance;

public class MethodOverridingExercise1 {
    public static void main(String[] args) {
        Employee3 employee1 = new Employee3(1, "John Doe", 5000.0);
        employee1.displayDetails();
        System.out.println("Calculated Salary: " + employee1.calculateSalary());

        System.out.println();

        Manager3 manager1 = new Manager3(2, "Jane Smith", 8000.0, 2000.0);
        manager1.displayDetails();
        System.out.println("Calculated Salary: " + manager1.calculateSalary());

        System.out.println();

        Developer3 developer1 = new Developer3(3, "Mike Johnson", 4000.0, 150);
        developer1.displayDetails();
        System.out.println("Calculated Salary: " + developer1.calculateSalary());
    }
}

class Employee3 {
    protected int id;
    protected String name;
    protected double salary;

    public Employee3 (int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary () {
        return salary;
    }

    public void displayDetails () {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager3 extends  Employee3 {
    private double bonus;

    public Manager3 (int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double calculateSalary () {
        return super.calculateSalary() + bonus;
    }

    public void displayDetails () {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
    }
}

class Developer3 extends Employee3 {
    private int hoursWorked;

    public Developer3 (int id, String name, double salary, int hoursWorked) {
        super(id, name, salary);
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary () {
        int standardHoursPerMonth = 160;
        double hourlyRate = salary / standardHoursPerMonth;
        return salary + (hoursWorked - standardHoursPerMonth) * hourlyRate;
    }

    public void displayDetails () {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
    }
}
