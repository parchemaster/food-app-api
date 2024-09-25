package org.example.foodappapi.dto;

public record ClothesDto(
        String gender,
        String masterCategory,
        String subCategory,
        String articleType,
        String baseColour,
        String season,
        int year,
        String usage,
        String productDisplayName
) {
}
