package com.xenosis.week4;

import java.util.HashMap;
import java.util.Scanner;


public class EmployeeManager {
    private HashMap<Integer, Employee> employeeMap;

    public EmployeeManager() {
        employeeMap = new HashMap<>();
    }

   public void addEmployee(int id, String name, String department, double salary) {
        Employee employee = new Employee(name, department, salary);
        employeeMap.put(id, employee);
        System.out.println("Employee added successfully.");
    }

    public void getEmployee(int id) {
        Employee employee = employeeMap.get(id);
        if (employee != null) {
            System.out.println("Employee Details: " + employee);
        } else {
            System.out.println("Employee with ID " + id + " not found.");
        }
    }

    public void displayAllEmployees() {
        if (employeeMap.isEmpty()) {
            System.out.println("No employees to display.");
        } else {
            System.out.println("List of Employees:");
            for (Integer id : employeeMap.keySet()) {
                System.out.println("ID: " + id + ", " + employeeMap.get(id));
            }
        }
    }

  public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Employee Manager Menu ---");
            System.out.println("1. Add Employee");
            System.out.println("2. Get Employee by ID");
            System.out.println("3. Display All Employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter employee ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter employee name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = scanner.nextDouble();
                    manager.addEmployee(id, name, department, salary);
                    break;
                case 2:
                    System.out.print("Enter employee ID to retrieve: ");
                    int searchId = scanner.nextInt();
                    manager.getEmployee(searchId);
                    break;
                case 3:
                    manager.displayAllEmployees();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
