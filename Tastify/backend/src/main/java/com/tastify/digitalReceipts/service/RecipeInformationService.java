package com.tastify.digitalReceipts.service;

import com.tastify.digitalReceipts.model.recipe.information.RecipeInformation;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RecipeInformationService {

    private final SpoonacularServiceApiCalls apiCalls;

    public RecipeInformation recipeInformationById(Long id) {
        ResponseEntity<RecipeInformation> recipeInformation = apiCalls.searchRecipeInformation(id);
        return recipeInformation.getBody();
    }
}
