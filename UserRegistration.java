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

        // Read user details
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        // Validate First Name
        if (validator.validateFirstName(firstName)) {
            System.out.println("Valid First Name.");
        } else {
            System.out.println("Invalid First Name.");
        }

        // Validate Last Name
        if (validator.validateLastName(lastName)) {
            System.out.println("Valid Last Name.");
        } else {
            System.out.println("Invalid Last Name.");
        }

        // Validate Email
        if (validator.validateEmail(email)) {
            System.out.println("Valid Email.");
        } else {
            System.out.println("Invalid Email.");
        }

        scanner.close();
    }
}