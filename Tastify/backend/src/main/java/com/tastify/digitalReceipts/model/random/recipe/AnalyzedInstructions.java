package com.tastify.digitalReceipts.model.random.recipe;

import lombok.Data;

import java.util.List;

@Data
public class AnalyzedInstructions {

    private String name;
    private List<Step> steps;
}
