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
    @Column(name = "master_category")
    private String masterCategory;
    @Column(name = "sub_category")
    private String subCategory;
    @Column(name = "article_type")
    private String articleType;
    @Column(name = "base_colour")
    private String baseColour;
    @Column(name = "season")
    private String season;
    @Column(name = "year")
    private int year;
    @Column(name = "usage")
    private String usage;
    @Column(name = "product_displayName")
    private String productDisplayName;


}
