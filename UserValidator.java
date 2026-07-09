package com.oops.userregistration;

import java.util.regex.Pattern;

/**
 * This class contains methods to validate user details.
 */
public class UserValidator {

    // Regular expression for validating first and last name
    // First letter must be uppercase followed by at least two lowercase letters
    private static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";

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
}