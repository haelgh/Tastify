package com.tastify.digitalReceipts.model.recipe.information;

import lombok.Data;

import java.util.List;

@Data
public class Nutrition {

    private List<Nutrient> nutrients;
    private List<Ingredient> ingredients;
    private CaloricBreakdown caloricBreakdown;
    private WeightPerServing weightPerServing;
}
