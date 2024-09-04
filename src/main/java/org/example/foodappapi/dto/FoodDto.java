package org.example.foodappapi.dto;

public record FoodDto (
        String productName,
        String manufacturer,
        String price,
        int averageReviewRating,
        String description,
        String productDescription
) {
}
