package com.oops.userregistration;

import java.util.regex.Pattern;

/**
 * This class contains methods to validate user details.
 */
public class UserValidator {

    // First and Last Name Regex
    private static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";

    // Email Regex
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";

    // Mobile Number Regex
    // Format: Country code followed by a space and a 10-digit mobile number
    // Example: 91 9919819801
    private static final String MOBILE_REGEX = "^[0-9]{2}\\s[0-9]{10}$";

    /**
     * Validates the user's first name.
     */
    public boolean validateFirstName(String firstName) {
        return Pattern.matches(NAME_REGEX, firstName);
    }

    /**
     * Validates the user's last name.
     */
    public boolean validateLastName(String lastName) {
        return Pattern.matches(NAME_REGEX, lastName);
    }

    /**
     * Validates the user's email.
     */
    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_REGEX, email);
    }

    /**
     * Validates the user's mobile number.
     */
    public boolean validateMobileNumber(String mobileNumber) {
        return Pattern.matches(MOBILE_REGEX, mobileNumber);
    }
}