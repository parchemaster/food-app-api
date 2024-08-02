package org.example.foodappapi.service;

import org.example.foodappapi.entity.Food;
import org.example.foodappapi.exception.FoodNotFoundException;
import org.example.foodappapi.exception.Messages;
import org.example.foodappapi.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public Food getFoodById(long id) {
        return foodRepository.findById(id).orElseThrow(() -> new FoodNotFoundException(Messages.FOOD_NOT_FOUND + id));
    }

    public List<Food> getFoddList() {
        return foodRepository.findAll();
    }

}
