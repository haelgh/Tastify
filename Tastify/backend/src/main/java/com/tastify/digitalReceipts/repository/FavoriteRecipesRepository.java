package com.tastify.digitalReceipts.repository;

import com.tastify.digitalReceipts.model.FavoriteRecipes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRecipesRepository extends JpaRepository<FavoriteRecipes, Long> {
}
