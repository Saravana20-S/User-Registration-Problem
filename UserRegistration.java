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

        try {

            System.out.println("First Name : " +
                    (validator.firstNameValidator.validate(firstName) ? "Valid" : "Invalid"));

            System.out.println("Last Name : " +
                    (validator.lastNameValidator.validate(lastName) ? "Valid" : "Invalid"));

            System.out.println("Email : " +
                    (validator.emailValidator.validate(email) ? "Valid" : "Invalid"));

            System.out.println("Mobile No. : " +
                    (validator.mobileValidator.validate(mobileNumber) ? "Valid" : "Invalid"));

            System.out.println("Password : " +
                    (validator.passwordValidator.validate(password) ? "Valid" : "Invalid"));

        } catch (UserRegistrationException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}