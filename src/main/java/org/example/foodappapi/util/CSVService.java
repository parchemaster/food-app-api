package org.example.foodappapi.util;


import jakarta.annotation.PostConstruct;
import org.example.foodappapi.entity.Clothes;
import org.example.foodappapi.repository.ClothesRepository;
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
    private ClothesRepository clothesRepository;

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
                clothes.setId(Long.parseLong(data[0]));
                clothes.setGender(data[1]);
                clothes.setMasterCategory(data[2]);
                clothes.setSubCategory(data[3]);
                clothes.setArticleType(data[4]);
                clothes.setBaseColour(data[5]);
                clothes.setSeason(data[6]);
                clothes.setYear(Integer.parseInt(data[7]));
                clothes.setUsage(data[8]);
                clothes.setProductDisplayName(data[9]);
                clothesList.add(clothes);
            }
            clothesRepository.saveAll(clothesList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
