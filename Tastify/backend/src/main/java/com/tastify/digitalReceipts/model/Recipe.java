package com.tastify.digitalReceipts.model;

import com.tastify.digitalReceipts.model.random.recipe.ExtendedIngredient;
import lombok.Data;

import java.util.List;

@Data
public class Recipe {

    private Long id;
    private String title;
    private Integer readyInMinutes;
    private Integer servings;
    private String image;
    private List<String> imageUrls;

}
