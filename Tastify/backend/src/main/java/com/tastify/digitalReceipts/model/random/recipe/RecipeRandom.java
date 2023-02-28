package com.tastify.digitalReceipts.model.random.recipe;


import lombok.Data;

import java.util.List;

@Data
public class RecipeRandom {

    private Long id;
    private String title;
    private Integer readyInMinutes;
    private Integer servings;
    private String image;
    private String imageType;
    private String summary;
    private Boolean vegetarian;
    private Boolean vegan;
    private Boolean glutenFree;
    private Boolean dairyFree;
    private Boolean veryHealthy;
    private Boolean cheap;
    private Boolean veryPopular;
    private Boolean sustainable;
    private Double weightWatcherSmartPoints;
    private String gaps;
    private Boolean lowFodmap;
    private String sourceUrl;
    private String spoonacularSourceUrl;
    private Integer aggregateLikes;
    private Integer spoonacularScore;
    private Integer healthScore;
    private String creditsText;
    private String license;
    private String sourceName;
    private Double pricePerServing;
    private List<ExtendedIngredient> extendedIngredients;
    private List<String> cuisines;
    private List<String> dishTypes;
    private List<String> diets;
    private List<String> occasions;
    private String instructions;
    private List<AnalyzedInstructions> analyzedInstructions;
    public Long originalId;
    private WinePairing winePairing;
}
