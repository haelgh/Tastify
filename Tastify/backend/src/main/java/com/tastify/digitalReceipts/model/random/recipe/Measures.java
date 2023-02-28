package com.tastify.digitalReceipts.model.random.recipe;

import com.tastify.digitalReceipts.model.recipe.information.Metric;
import com.tastify.digitalReceipts.model.recipe.information.Units;
import lombok.Data;

@Data
public class Measures {

    private Units units;
    private Metric metric;

}
