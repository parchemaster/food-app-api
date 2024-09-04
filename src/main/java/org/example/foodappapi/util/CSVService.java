package org.example.foodappapi.util;


import jakarta.annotation.PostConstruct;
import org.example.foodappapi.entity.Clothes;
import org.example.foodappapi.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

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
        saveUsersFromCSV("shoping.csv");
    }

    public void saveUsersFromCSV(String fileName) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new ClassPathResource(fileName).getInputStream(), StandardCharsets.UTF_8))) {
            List<Clothes> clothesList = new ArrayList<>();
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                Clothes clothes = new Clothes();
                clothes.setProductName(data[0]);
                clothes.setManufacturer(data[2]);
                clothes.setPrice(data[3]);
                clothes.setAverageReviewRating(Integer.parseInt(data[7]));
                clothes.setDescription(data[10]);
                clothes.setProductDescription(data[12]);
                clothesList.add(clothes);
            }
            foodRepository.saveAll(clothesList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
