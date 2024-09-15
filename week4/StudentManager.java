package com.xenosis.week4;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> studentList;

    public StudentManager() {
        studentList = new ArrayList<>();
    }

    public void addStudent(String name, int id) {
        Student student = new Student(name, id);
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    public void removeStudent(int id) {
        boolean found = false;
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("Student removed successfully.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void displayStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("List of Students:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        }
    }

 public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Manager Menu ---");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    scanner.nextLine(); 
                    String name = scanner.nextLine();
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    manager.addStudent(name, id);
                    break;
                case 2:
                    System.out.print("Enter student ID to remove: ");
                    int removeId = scanner.nextInt();
                    manager.removeStudent(removeId);
                    break;
                case 3:
                    manager.displayStudents();
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