package com.oops.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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
    public void givenValidFirstName_WhenValidated_ShouldReturnTrue() throws UserRegistrationException {
        Assertions.assertTrue(validator.firstNameValidator.validate("Saravanan"));
    }

//    @Test
//    public void givenInvalidFirstName_WhenValidated_ShouldThrowException() {
//        Assertions.assertThrows(
//                UserRegistrationException.class,
//                () -> validator.firstNameValidator.validate("Saravanan"));
//    }

    // ---------- Last Name ----------

    @Test
    public void givenValidLastName_WhenValidated_ShouldReturnTrue() throws UserRegistrationException {
        Assertions.assertTrue(validator.lastNameValidator.validate("Kumar"));
    }

    @Test
    public void givenInvalidLastName_WhenValidated_ShouldThrowException() {
        Assertions.assertThrows(
                UserRegistrationException.class,
                () -> validator.lastNameValidator.validate("Ku"));
    }

    // ---------- Email ----------

    @Test
    public void givenValidEmail_WhenValidated_ShouldReturnTrue() throws UserRegistrationException {
        Assertions.assertTrue(validator.emailValidator.validate("abc@yahoo.com"));
    }

    @Test
    public void givenInvalidEmail_WhenValidated_ShouldThrowException() {
        Assertions.assertThrows(
                UserRegistrationException.class,
                () -> validator.emailValidator.validate("abc@.com"));
    }

    // ---------- Mobile Number ----------

    @Test
    public void givenValidMobileNumber_WhenValidated_ShouldReturnTrue() throws UserRegistrationException {
        Assertions.assertTrue(validator.mobileValidator.validate("91 9876543210"));
    }

    @Test
    public void givenInvalidMobileNumber_WhenValidated_ShouldThrowException() {
        Assertions.assertThrows(
                UserRegistrationException.class,
                () -> validator.mobileValidator.validate("919876543210"));
    }

    // ---------- Password ----------

    @Test
    public void givenValidPassword_WhenValidated_ShouldReturnTrue() throws UserRegistrationException {
        Assertions.assertTrue(validator.passwordValidator.validate("Password1@"));
    }

    @Test
    public void givenInvalidPassword_WhenValidated_ShouldThrowException() {
        Assertions.assertThrows(
                UserRegistrationException.class,
                () -> validator.passwordValidator.validate("password"));
    }

    // ---------- Parameterized Test : Valid Emails ----------

    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    public void givenMultipleValidEmails_WhenValidated_ShouldReturnTrue(String email)
            throws UserRegistrationException {

        Assertions.assertTrue(validator.emailValidator.validate(email));
    }

    // ---------- Parameterized Test : Invalid Emails ----------

    @ParameterizedTest
    @ValueSource(strings = {
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
    })
    public void givenMultipleInvalidEmails_WhenValidated_ShouldThrowException(String email) {

        Assertions.assertThrows(
                UserRegistrationException.class,
                () -> validator.emailValidator.validate(email));
    }
}