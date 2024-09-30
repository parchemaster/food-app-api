package org.example.foodappapi.controller;

import org.example.foodappapi.dto.ClothesDto;
import org.example.foodappapi.facade.ClothesFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StoreController {

    @Autowired
    private ClothesFacade clothesFacade;

    @GetMapping("/account")
    public String getUserAccount() {
        return "user account";
    }

    @GetMapping("/cart")
    public String getUserCart() {
        return "user cart";
    }

    @GetMapping("/home")
    public String getHomePage() {
        return "Welcome home";
    }

    @GetMapping("/store")
    public List<ClothesDto> getAllItems() {
        return clothesFacade.getClothesList();
    }

    @GetMapping("store/{clothesId}")
    public ClothesDto getItemById(@PathVariable long clothesId) {
        return clothesFacade.getClothesById(clothesId);
    }
}
