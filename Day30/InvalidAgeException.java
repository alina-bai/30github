package org.example.Exceptions;

// Step 1: Define a custom exception by extending Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

