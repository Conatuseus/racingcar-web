package com.woowa.conatuseus.domain.exceptions;

public class InvalidCarNameException extends RuntimeException {
    public InvalidCarNameException(String message) {
        super(message);
    }
}
