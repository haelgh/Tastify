package com.tastify.digitalReceipts.service;

import com.tastify.digitalReceipts.model.RecipeResults;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SearchRecipesService {

    private final SpoonacularServiceApiCalls apiCalls;

    public RecipeResults searchByRecipe(String recipe) {
        ResponseEntity<RecipeResults> searchRecipeResults = apiCalls.searchRecipe(recipe);
        return searchRecipeResults.getBody();
    }
}
