package com.tastify.digitalReceipts.controller;

import com.tastify.digitalReceipts.model.*;
import com.tastify.digitalReceipts.model.RecipesWithDefinedIngredients;
import com.tastify.digitalReceipts.model.random.recipe.RecipeRandom;
import com.tastify.digitalReceipts.model.recipe.information.Aisle;
import com.tastify.digitalReceipts.model.recipe.information.RecipeInformation;
import com.tastify.digitalReceipts.service.*;
import com.tastify.digitalReceipts.model.Ingredients;
import com.tastify.digitalReceipts.model.RecipeResults;
import com.tastify.digitalReceipts.service.RandomRecipeService;
import com.tastify.digitalReceipts.service.RecipeInformationService;
import com.tastify.digitalReceipts.service.SearchRecipesByIngredientsService;
import com.tastify.digitalReceipts.service.SearchRecipesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping(path = "/recipes/")
@AllArgsConstructor
public class SearchController {
    private final SearchRecipesService searchRecipesService;
    private final SearchRecipesByIngredientsService searchRecipesByIngredientsService;
    private final RandomRecipeService randomRecipeService;
    private final RecipeInformationService recipeInformationService;

    @GetMapping(path = "/search/")
    public String searchRecipes(Model model,
                                @RequestParam(name = "q", required = false) String phrase) {
        if (phrase != null && !phrase.isEmpty()) {
            RecipeResults searchResult = searchRecipesService.searchByRecipe(phrase);
            model.addAttribute("q", phrase);
            model.addAttribute("recipes", searchResult);
        }
        return "recipe-list";
    }

    @GetMapping(path = "/findByIngredients/")
    public String findRecipeByIngredients(Model model,
                                          @RequestParam(name = "q", required = false) String phrase) {
        if (phrase != null && !phrase.isEmpty()) {
            Ingredients ingredients = new Ingredients(phrase);
            List<RecipesWithDefinedIngredients> searchResult = searchRecipesByIngredientsService.searchRecipe(ingredients);
            model.addAttribute("q", phrase);
            model.addAttribute("searchResults", searchResult);
            model.addAttribute("total", searchResult.size());
        }
        return "findByIngredients-list";
    }

    @GetMapping(path = "/random/")
    public String findRandomRecipe(Model model) {
        RecipeRandom random = randomRecipeService.searchRandomRecipe();
        model.addAttribute("recipe", random);
        model.addAttribute("instructions", random.getInstructions());
        return "random-recipe";
    }

    @GetMapping(path = "/details/{recipeId}")
    public String recipesInformation(Model model,
                                     @PathVariable Long recipeId) {
        RecipeInformation recipeInformation = recipeInformationService.recipeInformationById(recipeId);
        model.addAttribute("q", recipeId);
        model.addAttribute("recipe", recipeInformation);
        return "recipe-details";
    }

    @GetMapping(path = "/categories/")
    public String categories(Model model) {
        List<Aisle> list = Arrays.asList(Aisle.values());
        model.addAttribute("categories", list);
        return "categories";
    }

}