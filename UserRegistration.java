package com.oops.userregistration;

import java.util.Scanner;

/**
 * Main class to test User Registration validation.
 */
public class UserRegistration {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Create validator object
        UserValidator validator = new UserValidator();

        // Read first name
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        // Read last name
        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        // Validate first name
        if (validator.validateFirstName(firstName)) {
            System.out.println("Valid First Name.");
        } else {
            System.out.println("Invalid First Name.");
        }

        // Validate last name
        if (validator.validateLastName(lastName)) {
            System.out.println("Valid Last Name.");
        } else {
            System.out.println("Invalid Last Name.");
        }

        scanner.close();
    }
}