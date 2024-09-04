package org.example.foodappapi.mapper;

import org.example.foodappapi.dto.FoodDto;
import org.example.foodappapi.entity.Clothes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodMapperImpl implements FoodMapper{
    @Override
    public FoodDto mapToDto(Clothes clothes) {
        return new FoodDto(
                clothes.getProductName(),
                clothes.getManufacturer(),
                clothes.getPrice(),
                clothes.getAverageReviewRating(),
                clothes.getDescription(),
                clothes.getProductDescription()
        );
    }

    @Override
    public List<FoodDto> mapToDtos(List<Clothes> clothesList) {
        return clothesList.stream().map(this::mapToDto).toList();
    }
}
