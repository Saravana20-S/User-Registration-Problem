package com.oops.userregistration;

/**
 * Functional Interface for validating user details.
 */
@FunctionalInterface
public interface UserValidation {

    /**
     * Validates the given input.
     *
     * @param input User input
     * @return true if valid
     * @throws UserRegistrationException if validation fails
     */
    boolean validate(String input) throws UserRegistrationException;
}