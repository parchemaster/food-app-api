package org.example.foodappapi.mapper;

import org.example.foodappapi.dto.FoodDto;
import org.example.foodappapi.entity.Food;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodMapperImpl implements FoodMapper{
    @Override
    public FoodDto mapToDto(Food food) {
        return new FoodDto(
                food.getFood(),
                food.getGrams(),
                food.getCalories(),
                food.getProtein(),
                food.getDat(),
                food.getCarbs()
        );
    }

    @Override
    public List<FoodDto> mapToDtos(List<Food> foodList) {
        return foodList.stream().map(this::mapToDto).toList();
    }
}
