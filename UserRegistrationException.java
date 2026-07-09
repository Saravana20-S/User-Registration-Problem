package com.oops.userregistration;

/**
 * Custom exception for invalid user registration details.
 */
public class UserRegistrationException extends Exception {

    /**
     * Enum to represent different validation failures.
     */
    public enum ExceptionType {
        INVALID_FIRST_NAME,
        INVALID_LAST_NAME,
        INVALID_EMAIL,
        INVALID_MOBILE_NUMBER,
        INVALID_PASSWORD
    }

    public ExceptionType type;

    /**
     * Constructor for custom exception.
     *
     * @param type Exception type
     * @param message Exception message
     */
    public UserRegistrationException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}