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
    // Lambda to validate First Name
    public UserValidation firstNameValidator = firstName -> {
        if (Pattern.matches(NAME_REGEX, firstName)) {
            return true;
        }
        throw new UserRegistrationException(
                UserRegistrationException.ExceptionType.INVALID_FIRST_NAME,
                "Invalid First Name");
    };

    // Lambda to validate Last Name
    public UserValidation lastNameValidator = lastName -> {
        if (Pattern.matches(NAME_REGEX, lastName)) {
            return true;
        }
        throw new UserRegistrationException(
                UserRegistrationException.ExceptionType.INVALID_LAST_NAME,
                "Invalid Last Name");
    };

    // Lambda to validate Email
    public UserValidation emailValidator = email -> {
        if (Pattern.matches(EMAIL_REGEX, email)) {
            return true;
        }
        throw new UserRegistrationException(
                UserRegistrationException.ExceptionType.INVALID_EMAIL,
                "Invalid Email");
    };

    // Lambda to validate Mobile Number
    public UserValidation mobileValidator = mobile -> {
        if (Pattern.matches(MOBILE_REGEX, mobile)) {
            return true;
        }
        throw new UserRegistrationException(
                UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER,
                "Invalid Mobile Number");
    };

    // Lambda to validate Password
    public UserValidation passwordValidator = password -> {
        if (Pattern.matches(PASSWORD_REGEX, password)) {
            return true;
        }
        throw new UserRegistrationException(
                UserRegistrationException.ExceptionType.INVALID_PASSWORD,
                "Invalid Password");
    };
}