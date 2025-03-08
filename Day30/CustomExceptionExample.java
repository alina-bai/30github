package org.example.Exceptions;

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            checkAge(15); // This will throw our custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    // Step 2: Method that throws the custom exception
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
        System.out.println("Access granted.");
    }
}
