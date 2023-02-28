package com.tastify.digitalReceipts.model.random.recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class MeasuresProperties {

    private Double amount;
    private String unitShort;
    private String unitLong;
}
