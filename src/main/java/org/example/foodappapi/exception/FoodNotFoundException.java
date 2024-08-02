package org.example.foodappapi.exception;

public class FoodNotFoundException extends FoodRuntimeException{
    public FoodNotFoundException(String message) {
        super(message);
    }
}
