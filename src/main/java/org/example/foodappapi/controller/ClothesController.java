package org.example.foodappapi.controller;

import org.example.foodappapi.dto.ClothesDto;
import org.example.foodappapi.facade.ClothesFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clothes")
public class ClothesController {

    @Autowired
    private ClothesFacade clothesFacade;

    @GetMapping()
    public List<ClothesDto> getAllItems() {
        return clothesFacade.getClothesList();
    }

    @GetMapping("/{clothesId}")
    public ClothesDto getItemById(@PathVariable long clothesId) {
        return clothesFacade.getClothesById(clothesId);
    }
}
