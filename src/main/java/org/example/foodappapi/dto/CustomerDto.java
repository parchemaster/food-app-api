package org.example.foodappapi.dto;

public record CustomerDto(
        long id,
        String email,
        String pwd,
        String role
) {
}
