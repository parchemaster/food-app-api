package org.example.foodappapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Clothes")
public class Clothes {
    @Id
    @Column(name = "uniq_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uniqId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "manufacturer")
    private String manufacturer;
    @Column(name = "price")
    private String price;
    @Column(name = "average_review_rating")
    private int averageReviewRating;
    @Column(name = "description")
    private String description;
    @Column(name = "product_description")
    private String productDescription;
}
