package com.tastify.digitalReceipts.model.recipe.information;

import lombok.Data;

import java.util.List;

@Data
public class Ingredient {

    private String name;
    private Float amount;
    private String unit;
    private List<NutrientIngredient> nutrients;

}
