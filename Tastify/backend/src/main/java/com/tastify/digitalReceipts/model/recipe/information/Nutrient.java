package com.tastify.digitalReceipts.model.recipe.information;

import lombok.Data;

@Data
public class Nutrient {

    private String title;
    private Double amount;
    private String unit;
    private Double percentOfDailyNeeds;
}
