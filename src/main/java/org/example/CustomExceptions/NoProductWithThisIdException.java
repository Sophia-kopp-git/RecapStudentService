package org.example.CustomExceptions;

public class NoProductWithThisIdException extends RuntimeException {
    public NoProductWithThisIdException(String message) {
        super(message);
    }
}
