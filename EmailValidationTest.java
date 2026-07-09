package com.oops.userregistration;

/**
 * Tests all valid and invalid email samples.
 */
public class EmailValidationTest {

    public static void main(String[] args) {

        UserValidator validator = new UserValidator();

        // Valid email samples
        String[] validEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        // Invalid email samples
        String[] invalidEmails = {
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        System.out.println("========== VALID EMAILS ==========");

        for (String email : validEmails) {
            System.out.printf("%-30s : %s%n",
                    email,
                    validator.validateEmail(email) ? "Valid" : "Invalid");
        }

        System.out.println("\n========== INVALID EMAILS ==========");

        for (String email : invalidEmails) {
            System.out.printf("%-30s : %s%n",
                    email,
                    validator.validateEmail(email) ? "Valid" : "Invalid");
        }
    }
}