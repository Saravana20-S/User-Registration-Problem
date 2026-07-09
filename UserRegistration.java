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

        System.out.print("Enter Mobile Number: ");
        String mobileNumber = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        // Validate First Name
        System.out.println("First Name : " +
                (validator.validateFirstName(firstName) ? "Valid" : "Invalid"));

        // Validate Last Name
        System.out.println("Last Name  : " +
                (validator.validateLastName(lastName) ? "Valid" : "Invalid"));

        // Validate Email
        System.out.println("Email      : " +
                (validator.validateEmail(email) ? "Valid" : "Invalid"));

        // Validate Mobile Number
        System.out.println("Mobile No. : " +
                (validator.validateMobileNumber(mobileNumber) ? "Valid" : "Invalid"));

        // Validate Password
        System.out.println("Password   : " +
                (validator.validatePassword(password) ? "Valid" : "Invalid"));

        scanner.close();
    }
}