package com.xenosis.week4;

import java.util.Scanner;

class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class ExceptionHandling {

 public static void performDivision(int a, int b) {
     try {
         int result = a / b; 
         System.out.println("Result of division: " + result);
     } catch (ArithmeticException e) {
         System.out.println("Error: Division by zero is not allowed.");
     }
 }

 public static void printLength(String str) {
     try {
         System.out.println("Length of the string: " + str.length()); 
     } catch (NullPointerException e) {
         System.out.println("Error: The string is null.");
     }
 }

 public static void validateAge(int age) throws InvalidAgeException {
     if (age < 0 || age > 150) {
         throw new InvalidAgeException("Invalid age: " + age + ". Age must be between 0 and 150.");
     } else {
         System.out.println("Valid age: " + age);
     }
 }


 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter two integers for division (a / b): ");
     int a = scanner.nextInt();
     int b = scanner.nextInt();
     performDivision(a, b);

    System.out.print("\nEnter a string (or type 'null' for testing NullPointerException): ");
     scanner.nextLine(); 
     String input = scanner.nextLine();
     if ("null".equals(input)) {
         input = null; 
     }
     printLength(input);

    try {
         System.out.print("\nEnter age to validate: ");
         int age = scanner.nextInt();
         validateAge(age);
     } catch (InvalidAgeException e) {
         System.out.println("Custom Exception Caught: " + e.getMessage());
     }

     scanner.close();
 }
}

