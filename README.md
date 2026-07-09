# User Registration System

A Java-based User Registration application that validates user details using **Regular Expressions (Regex)** and **JUnit 5**. The project is developed incrementally through multiple use cases, following clean coding practices and modular design.

## Features

- Validate First Name
- Validate Last Name
- Validate Email Address
- Validate Mobile Number
- Validate Password
- Test valid and invalid email samples
- JUnit 5 test cases for all validations
- Parameterized JUnit tests for multiple email inputs
- Custom Exception handling for invalid user details

## Validation Rules

### First Name
- Starts with a capital letter.
- Minimum 3 characters.

### Last Name
- Starts with a capital letter.
- Minimum 3 characters.

### Email
- Supports standard email formats.
- Validates mandatory and optional parts using Regular Expressions.

### Mobile Number
- Country code followed by a space.
- Ten-digit mobile number.
- Example:
  ```
  91 9876543210
  ```

### Password
- Minimum 8 characters.
- At least one uppercase letter.
- At least one numeric digit.
- Exactly one special character.

## Project Structure

```text
UserRegistration/
│
├── src/
│   └── com/
│       └── oops/
│           └── userregistration/
│               ├── UserRegistration.java
│               ├── UserValidator.java
│               ├── UserRegistrationException.java
│               ├── EmailValidationTest.java
│               └── UserValidatorTest.java
```

## Technologies Used

- Java
- Regular Expressions (Regex)
- JUnit 5
- IntelliJ IDEA

## JUnit Test Coverage

- First Name Validation
- Last Name Validation
- Email Validation
- Mobile Number Validation
- Password Validation
- Happy Test Cases
- Sad Test Cases
- Parameterized Email Validation Tests
- Custom Exception Validation Tests

## Exception Handling

A custom exception (`UserRegistrationException`) is used to identify invalid user inputs with specific exception types:

- Invalid First Name
- Invalid Last Name
- Invalid Email
- Invalid Mobile Number
- Invalid Password

## Git Workflow

```text
main
│
└── dev
    │
    ├── feature/uc1-first-name-validation
    ├── feature/uc2-last-name-validation
    ├── feature/uc3-email-validation
    ├── feature/uc4-mobile-number-validation
    ├── feature/uc5-password-rule1
    ├── feature/uc6-password-rule2
    ├── feature/uc7-password-rule3
    ├── feature/uc8-password-rule4
    ├── feature/uc9-email-validation-test
    ├── feature/uc10-junit-user-validation
    ├── feature/uc11-parameterized-email-test
    └── feature/uc12-custom-exception
```

## Learning Outcomes

- Object-Oriented Programming
- Regular Expressions in Java
- Exception Handling
- Custom Exceptions
- JUnit 5 Testing
- Parameterized Testing
- Clean Code Practices
- Git Branching Strategy