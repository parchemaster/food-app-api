package org.example.foodappapi.repository;

import org.example.foodappapi.entity.Clothes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Clothes, Long> {
}
