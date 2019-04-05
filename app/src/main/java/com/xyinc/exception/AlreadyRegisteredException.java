package com.xyinc.exception;

public class AlreadyRegisteredException extends RuntimeException{

    public AlreadyRegisteredException(String message) {
        super(message);
    }

}
