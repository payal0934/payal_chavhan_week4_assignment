package com.xenosis.week4;

import java.util.HashMap;
import java.util.Scanner;

class Employee {
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Department: " + department + ", Salary: $" + salary;
    }
}

