package org.example.foodappapi.mapper;

import org.example.foodappapi.dto.FoodDto;
import org.example.foodappapi.entity.Food;

import java.util.List;

public interface FoodMapper {

    FoodDto mapToDto(Food food);
    List<FoodDto> mapToDtos(List<Food> foodList);
}
