package org.example.foodappapi.controller;

import org.example.foodappapi.dto.FoodDto;
import org.example.foodappapi.facade.FoodFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/foods")
public class FoodController {

    @Autowired
    private FoodFacade foodFacade;

    @GetMapping()
    public List<FoodDto> getAllFood() {
        return foodFacade.getFoodList();
    }

    @GetMapping("/{foodId}")
    public FoodDto getFoodById(@PathVariable long foodId) {
        return foodFacade.getFoodById(foodId);
    }
}
