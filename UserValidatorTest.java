package com.oops.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit Test Cases for User Registration Validation.
 */
public class UserValidatorTest {

    private UserValidator validator;

    /**
     * Creates a UserValidator object before each test.
     */
    @BeforeEach
    public void setUp() {
        validator = new UserValidator();
    }

    // ---------- First Name ----------

    @Test
    public void givenValidFirstName_WhenValidated_ShouldReturnTrue() {
        Assertions.assertTrue(validator.validateFirstName("Saravanan"));
    }

    @Test
    public void givenInvalidFirstName_WhenValidated_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validateFirstName("saravanan"));
    }

    // ---------- Last Name ----------

    @Test
    public void givenValidLastName_WhenValidated_ShouldReturnTrue() {
        Assertions.assertTrue(validator.validateLastName("Kumar"));
    }

    @Test
    public void givenInvalidLastName_WhenValidated_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validateLastName("ku"));
    }

    // ---------- Email ----------

    @Test
    public void givenValidEmail_WhenValidated_ShouldReturnTrue() {
        Assertions.assertTrue(validator.validateEmail("abc@yahoo.com"));
    }

    @Test
    public void givenInvalidEmail_WhenValidated_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validateEmail("abc@.com"));
    }

    // ---------- Mobile Number ----------

    @Test
    public void givenValidMobileNumber_WhenValidated_ShouldReturnTrue() {
        Assertions.assertTrue(validator.validateMobileNumber("91 9876543210"));
    }

    @Test
    public void givenInvalidMobileNumber_WhenValidated_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validateMobileNumber("919876543210"));
    }

    // ---------- Password ----------

    @Test
    public void givenValidPassword_WhenValidated_ShouldReturnTrue() {
        Assertions.assertTrue(validator.validatePassword("Password1@"));
    }

    @Test
    public void givenInvalidPassword_WhenValidated_ShouldReturnFalse() {
        Assertions.assertFalse(validator.validatePassword("password"));
    }
}