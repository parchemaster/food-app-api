package org.example.foodappapi.service;

import org.example.foodappapi.entity.Clothes;
import org.example.foodappapi.exception.ClothesNotFoundException;
import org.example.foodappapi.exception.Messages;
import org.example.foodappapi.repository.ClothesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClothesService {

    @Autowired
    private ClothesRepository clothesRepository;

    public Clothes getClothesById(long id) {
        return clothesRepository.findById(id).orElseThrow(() -> new ClothesNotFoundException(Messages.FOOD_NOT_FOUND + id));
    }

    public List<Clothes> getClothesList() {
        return clothesRepository.findAll();
    }

}
