package org.example.foodappapi.dto;

public record FoodDto (
        String name,
        int grams,
        int calories,
        int protein,
        int dat,
        int carbs
) {
}
