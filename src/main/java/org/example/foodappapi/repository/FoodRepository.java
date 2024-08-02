package org.example.foodappapi.repository;

import org.example.foodappapi.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
