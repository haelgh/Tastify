package com.tastify.digitalReceipts.service;

import com.tastify.digitalReceipts.model.Ingredients;
import com.tastify.digitalReceipts.model.RecipeResults;
import com.tastify.digitalReceipts.model.RecipesWithDefinedIngredients;
import com.tastify.digitalReceipts.model.random.recipe.RecipeRandomResponse;
import com.tastify.digitalReceipts.model.recipe.information.RecipeInformation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class SpoonacularServiceApiCalls {
    private final static String SEARCH_URL = "https://api.spoonacular.com/recipes/search";
    private final static String SEARCH_BY_INGREDIENTS_URL = "https://api.spoonacular.com/recipes/findByIngredients";
    private final static String RANDOM_RECIPE_URL = "https://api.spoonacular.com/recipes/random?number=1";
    private final static String RECIPE_INFORMATION_URL = "https://api.spoonacular.com/recipes";

    private final RestTemplate restTemplate;
    private final RecipeUrlCreator recipeUrlCreator;

    public ResponseEntity<RecipeResults> searchRecipe(String recipe) {
        log.info("Composed url: " + SEARCH_URL);
        ResponseEntity<RecipeResults> resp = restTemplate.exchange(
                recipeUrlCreator.createURLWithKey(SEARCH_URL + recipeSearch(recipe)),
                HttpMethod.GET,
                null,
                RecipeResults.class);

        log.info(": " + resp.getBody());
        return resp;
    }

    private String recipeSearch(String recipe) {
        return "?query=" + recipe + "&number=10";
    }

    public ResponseEntity<List<RecipesWithDefinedIngredients>> searchRecipeWithIngredients(Ingredients ingredients) {
        log.info("Composed url: " + SEARCH_BY_INGREDIENTS_URL);
        ResponseEntity<List<RecipesWithDefinedIngredients>> resp = restTemplate.exchange(
                recipeUrlCreator.createURLWithKey(SEARCH_BY_INGREDIENTS_URL + searchRecipeWithIngredients(ingredients.compose())),
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>(){});
        log.info(": " + resp.getBody());
        return resp;
    }

    private String searchRecipeWithIngredients(String ingredients) {
        return "?ingredients=" + ingredients + "&number=10";
    }

    public ResponseEntity<RecipeRandomResponse> randomRecipe() {
        log.info("Composed url: " + RANDOM_RECIPE_URL);
        ResponseEntity<RecipeRandomResponse> resp = restTemplate.exchange(
                recipeUrlCreator.createURLWithKey(RANDOM_RECIPE_URL),
                HttpMethod.GET,
                null,
                RecipeRandomResponse.class);
        log.info(": " + resp.getBody());
        return resp;
    }

    public ResponseEntity<RecipeInformation> searchRecipeInformation(Long id) {
        log.info("Composed url: " + RECIPE_INFORMATION_URL);
        ResponseEntity<RecipeInformation> resp = restTemplate.exchange(
                recipeUrlCreator.createURLWithKey(RECIPE_INFORMATION_URL + recipeInformation(id)),
                HttpMethod.GET,
                null,
                RecipeInformation.class);

        log.info(": " + resp.getBody());
        return resp;
    }

    private String recipeInformation(Long id) {
        return "/" + id + "/information?";
    }
}

