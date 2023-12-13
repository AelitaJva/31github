package com.java.Week14_OOP_Polymorphism;

public class OverloadingAndOverridingMethods {
    public static void main(String[] args) {
        // Creating an Employee
        Employee employee = new Employee("John Doe", 50000.0);
        System.out.println("Employee Salary: " + employee.calculateSalary()); // Outputs base salary

        // Creating a Manager
        Manager manager = new Manager("Jane Smith", 60000.0);
        System.out.println("Manager Salary: " + manager.calculateSalary()); // Outputs base salary + 10% bonus

        // Creating a Salesperson
        Salesperson salesperson = new Salesperson("Bob Johnson", 40000.0, 100000.0);
        System.out.println("Salesperson Salary: " + salesperson.calculateSalary()); // Outputs base salary + 5% commission
    }
}

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double calculateSalary () {
        return salary;
    }

    public double calculateSalary (double bonus) {
        return salary+=bonus;
    }
}

class Manager extends Employee {
    public Manager (String name, double salary) {
        super(name, salary);
    }

    @Override
    public double calculateSalary () {
        // 10 % = 0.1
        return super.calculateSalary() + (super.calculateSalary() * 0.1);
    }
}

class Salesperson extends  Employee {
    double salesAmount;
    public Salesperson (String name, double salary, double salesAmount) {
        super(name, salary);
        this.salesAmount = salesAmount;
    }

    public double calculateSalary () {
        // 5 % = 0.05
        return super.calculateSalary() + (0.05 * salesAmount);
    }
}
