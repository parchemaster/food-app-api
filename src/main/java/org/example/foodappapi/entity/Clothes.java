package org.example.foodappapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CLOTHES")
public class Clothes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "gender")
    private String gender;
    @Column(name = "masterCategory")
    private String masterCategory;
    @Column(name = "subCategory")
    private String subCategory;
    @Column(name = "articleType")
    private String articleType;
    @Column(name = "baseColour")
    private String baseColour;
    @Column(name = "season")
    private String season;
    @Column(name = "year_value")
    private int year;
    @Column(name = "usage")
    private String usage;
    @Column(name = "productDisplayName")
    private String productDisplayName;


}
