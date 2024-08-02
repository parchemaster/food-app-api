package org.example.foodappapi.util;


import jakarta.annotation.PostConstruct;
import org.example.foodappapi.entity.Food;
import org.example.foodappapi.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class CSVService {

    @Autowired
    private FoodRepository foodRepository;

    @PostConstruct
    public void init() {
        saveUsersFromCSV("nutrients_csvfile.csv");
    }

    public void saveUsersFromCSV(String fileName) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new ClassPathResource(fileName).getInputStream(), StandardCharsets.UTF_8))) {
            List<Food> foodList = new ArrayList<>();
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Food food = new Food();
                food.setFood(data[0]);
                food.setMeasure(data[1]);
                foodList.add(food);
            }
            foodRepository.saveAll(foodList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}