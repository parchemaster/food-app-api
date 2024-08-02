package org.example.foodappapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Nutritions")
public class Food {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Food")
    private String food;
    @Column(name = "Measure")
    private String measure;
    @Column(name = "Grams")
    private int grams;
    @Column(name = "Calories")
    private int calories;
    @Column(name = "Protein")
    private int protein;
    @Column(name = "Fat")
    private int dat;
    @Column(name = "Carbs")
    private int carbs;
}
