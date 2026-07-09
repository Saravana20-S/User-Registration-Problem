package com.oops.userregistration;

import java.util.regex.Pattern;

/**
 * This class contains methods to validate user details.
 */
public class UserValidator {

    // First and Last Name Regex
    private static final String NAME_REGEX = "^[A-Z][a-z]{2,}$";

    // Email Regex
    // Supports all valid email samples and rejects invalid samples
    private static final String EMAIL_REGEX =
            "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,}){1,2}$";

    // Mobile Number Regex
    private static final String MOBILE_REGEX = "^[0-9]{2}\\s[0-9]{10}$";

    // Password Rules:
    // Rule 1 -> Minimum 8 characters
    // Rule 2 -> At least one uppercase letter
    // Rule 3 -> At least one numeric digit
    // Rule 4 -> Exactly one special character
    private static final String PASSWORD_REGEX =
            "^(?=.*[A-Z])(?=.*\\d)(?=(?:.*[^a-zA-Z0-9]){1})(?!.*[^a-zA-Z0-9].*[^a-zA-Z0-9]).{8,}$";

    /**
     * Validates the user's first name.
     */
    public boolean validateFirstName(String firstName) throws UserRegistrationException {

        if (Pattern.matches(NAME_REGEX, firstName)) {
            return true;
        }

        throw new UserRegistrationException(
                UserRegistrationException.ExceptionType.INVALID_FIRST_NAME,
                "Invalid First Name");
    }


    /**
     * Validates the user's last name.
     */
    public boolean validateLastName(String lastName) throws UserRegistrationException {

        if (Pattern.matches(NAME_REGEX, lastName)) {
            return true;
        }

        throw new UserRegistrationException(
                UserRegistrationException.ExceptionType.INVALID_LAST_NAME,
                "Invalid Last Name");
    }

    /**
     * Validates the user's email.
     */
    public boolean validateEmail(String email) throws UserRegistrationException {

        if (Pattern.matches(EMAIL_REGEX, email)) {
            return true;
        }

        throw new UserRegistrationException(
                UserRegistrationException.ExceptionType.INVALID_EMAIL,
                "Invalid Email");
    }


    /**
     * Validates the user's mobile number.
     */
    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationException {

        if (Pattern.matches(MOBILE_REGEX, mobileNumber)) {
            return true;
        }

        throw new UserRegistrationException(
                UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER,
                "Invalid Mobile Number");
    }

    /**
     * Validates the user's password.
     * Rule 1: Minimum 8 characters
     * Rule 2: At least one uppercase letter
     * Rule 3: At least one numeric digit
     * Rule 4: Exactly one special character
     */
    public boolean validatePassword(String password) throws UserRegistrationException {

        if (Pattern.matches(PASSWORD_REGEX, password)) {
            return true;
        }

        throw new UserRegistrationException(
                UserRegistrationException.ExceptionType.INVALID_PASSWORD,
                "Invalid Password");
    }
}