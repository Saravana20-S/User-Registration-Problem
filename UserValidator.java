package com.oops.userregistration;

import java.util.regex.Pattern;

/**
 * This class contains methods to validate user details.
 */
public class UserValidator {

    // Regular expression for validating first and last name
    private static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";

    // Regular expression for validating email
    // Examples:
    // abc@bl.co
    // abc.xyz@bl.co
    // abc@bl.co.in
    // abc.xyz@bl.co.in
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

    /**
     * Validates the user's first name.
     *
     * @param firstName User's first name
     * @return true if valid, otherwise false
     */
    public boolean validateFirstName(String firstName) {
        return Pattern.matches(NAME_REGEX, firstName);
    }

    /**
     * Validates the user's last name.
     *
     * @param lastName User's last name
     * @return true if valid, otherwise false
     */
    public boolean validateLastName(String lastName) {
        return Pattern.matches(NAME_REGEX, lastName);
    }

    /**
     * Validates the user's email address.
     *
     * @param email User's email
     * @return true if valid, otherwise false
     */
    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }
}