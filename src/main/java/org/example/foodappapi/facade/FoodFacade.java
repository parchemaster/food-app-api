package org.example.foodappapi.facade;

import org.example.foodappapi.dto.FoodDto;
import org.example.foodappapi.mapper.FoodMapperImpl;
import org.example.foodappapi.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodFacade {

    @Autowired
    private FoodService foodService;
    @Autowired
    private FoodMapperImpl foodMapper;

    public FoodDto getFoodById(long id) {
        return foodMapper.mapToDto(foodService.getFoodById(id));
    }

    public List<FoodDto> getFoodList() {
        return foodMapper.mapToDtos(foodService.getFoddList());
    }
}
