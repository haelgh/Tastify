package com.tastify.digitalReceipts.model;

import lombok.Data;

import java.util.List;

@Data
public class RecipeResults {

    private List<Recipe> results;
    private String baseUri;
    private Integer offset;
    private Integer number;
    private Integer totalResults;
    private Integer processingTimeMs;
    private Long expires;
    private Boolean isStale;

}
