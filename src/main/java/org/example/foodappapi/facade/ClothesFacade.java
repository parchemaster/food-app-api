package org.example.foodappapi.facade;

import org.example.foodappapi.dto.ClothesDto;
import org.example.foodappapi.mapper.ClothesMapperImpl;
import org.example.foodappapi.service.ClothesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothesFacade {

    @Autowired
    private ClothesService clothesService;
    @Autowired
    private ClothesMapperImpl clothesMapper;

    public ClothesDto getClothesById(long id) {
        return clothesMapper.mapToDto(clothesService.getClothesById(id));
    }

    public List<ClothesDto> getClothesList() {
        return clothesMapper.mapToDtos(clothesService.getClothesList());
    }
}
