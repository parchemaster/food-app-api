package org.example.foodappapi.mapper;

import org.example.foodappapi.dto.ClothesDto;
import org.example.foodappapi.entity.Clothes;

import java.util.List;

public interface ClothesMapper {

    ClothesDto mapToDto(Clothes clothes);
    List<ClothesDto> mapToDtos(List<Clothes> clothesList);
}
