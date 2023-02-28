package com.tastify.digitalReceipts.model.random.recipe;

import lombok.Data;

import java.util.List;

@Data
public class ExtendedIngredient {

    private Long id;
    private String aisle;
    private String image;
    private String consistency;
    private String name;
    private String original;
    private String originalString;
    private String originalName;
    private Double amount;
    private String unit;
    private List<String> meta;
    private List<String> metaInformation;
    private Measures measures;

}