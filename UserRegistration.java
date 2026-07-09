package com.oops.userregistration;

import java.util.Scanner;

/**
 * Main class to test User Registration validation.
 */
public class UserRegistration {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Create validator object
        UserValidator validator = new UserValidator();

        // Read first name from user
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        // Validate first name
        if (validator.validateFirstName(firstName)) {
            System.out.println("Valid First Name.");
        } else {
            System.out.println("Invalid First Name.");
            System.out.println("First name should start with a capital letter and contain at least 3 characters.");
        }

        scanner.close();
    }
}