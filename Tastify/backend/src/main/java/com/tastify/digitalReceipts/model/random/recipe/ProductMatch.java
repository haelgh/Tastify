package com.tastify.digitalReceipts.model.random.recipe;

import lombok.Data;

@Data
public class ProductMatch {

    private Integer id;
    private String title;
    private String description;
    private String price;
    private String imageUrl;
    private Double averageRating;
    private Integer ratingCount;
    private Float score;
    private String link;
}
