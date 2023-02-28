package com.tastify.digitalReceipts.service;

import com.tastify.digitalReceipts.model.FavoriteRecipes;
import com.tastify.digitalReceipts.repository.FavoriteRecipesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FavoriteRecipesService {

    private final FavoriteRecipesRepository favoriteRecipesRepository;

    public void save(String title, Long recipeId) {
        FavoriteRecipes recipe = new FavoriteRecipes(title, recipeId);
        favoriteRecipesRepository.save(recipe);

    }

    public List<FavoriteRecipes> list() {
        return favoriteRecipesRepository.findAll();
    }

    public void delete(Long recipeId) {
        favoriteRecipesRepository.deleteById(recipeId);
    }
}