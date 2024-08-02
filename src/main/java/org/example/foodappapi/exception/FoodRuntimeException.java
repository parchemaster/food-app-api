package org.example.foodappapi.exception;



public class FoodRuntimeException extends RuntimeException {

    public FoodRuntimeException(String message) {
        super(message);
    }

    public FoodRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }
}
