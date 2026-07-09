package com.oops.userregistration;

import java.util.regex.Pattern;

/**
 * This class contains methods to validate user details.
 */
public class UserValidator {

    // Regex:
    // ^             -> Start of string
    // [A-Z]         -> First character must be uppercase
    // [a-z]{2,}     -> Minimum two lowercase letters after first character
    // $             -> End of string
    private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}$";

    /**
     * Validates the user's first name.
     *
     * @param firstName User's first name
     * @return true if valid, otherwise false
     */
    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME_REGEX, firstName);
    }
}