package org.example.foodappapi.mapper;

import org.example.foodappapi.dto.FoodDto;
import org.example.foodappapi.entity.Clothes;

import java.util.List;

public interface FoodMapper {

    FoodDto mapToDto(Clothes clothes);
    List<FoodDto> mapToDtos(List<Clothes> clothesList);
}
