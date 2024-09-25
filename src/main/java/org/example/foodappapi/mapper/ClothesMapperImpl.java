package org.example.foodappapi.mapper;

import org.example.foodappapi.dto.ClothesDto;
import org.example.foodappapi.entity.Clothes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothesMapperImpl implements ClothesMapper {
    @Override
    public ClothesDto mapToDto(Clothes clothes) {
        return new ClothesDto(
                clothes.getGender(),
                clothes.getMasterCategory(),
                clothes.getSubCategory(),
                clothes.getArticleType(),
                clothes.getBaseColour(),
                clothes.getSeason(),
                clothes.getYear(),
                clothes.getUsage(),
                clothes.getProductDisplayName()
        );
    }

    @Override
    public List<ClothesDto> mapToDtos(List<Clothes> clothesList) {
        return clothesList.stream().map(this::mapToDto).toList();
    }
}
