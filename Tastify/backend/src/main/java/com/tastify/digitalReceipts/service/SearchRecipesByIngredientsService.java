package com.tastify.digitalReceipts.service;

import com.tastify.digitalReceipts.model.Ingredients;
import com.tastify.digitalReceipts.model.RecipesWithDefinedIngredients;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SearchRecipesByIngredientsService {

    private final SpoonacularServiceApiCalls apiCalls;

    public List<RecipesWithDefinedIngredients> searchRecipe(Ingredients ingredients) {
        ResponseEntity<List<RecipesWithDefinedIngredients>> searchRecipesWithDefinedIngredients = apiCalls.searchRecipeWithIngredients(ingredients);

        return searchRecipesWithDefinedIngredients.getBody();
    }
}
