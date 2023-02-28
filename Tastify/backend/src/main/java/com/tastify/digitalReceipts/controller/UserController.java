package com.tastify.digitalReceipts.controller;

import com.tastify.digitalReceipts.service.FavoriteRecipesService;
import com.tastify.digitalReceipts.service.FridgeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final FavoriteRecipesService favoriteRecipesService;
    private final FridgeService fridgeService;

    @GetMapping("/add-favorite")
    public String addFavorite(@RequestParam(name = "recipeId") Long recipeId,
                              @RequestParam(name = "title") String title) {

        favoriteRecipesService.save(title, recipeId);
        return "redirect:/user/favorite-list";
    }

    @GetMapping("/favorite-list")
    public String getUserFavoriteRecipeList(Model model) {
        model.addAttribute("favoriteList", favoriteRecipesService.list());
        return "favorite-list";
    }

    @GetMapping("/delete/{recipeId}")
    public String delete(@PathVariable("recipeId") Long recipeId) {
        favoriteRecipesService.delete(recipeId);
        return "redirect:/user/favorite-list";
    }

    @GetMapping("/add-fridgeItem")
    public String addFridgeItem(@RequestParam(name = "id") Long itemId,
                              @RequestParam(name = "title") String title) {

        fridgeService.save(title, itemId);
        return "redirect:/user/fridge";
    }

    @GetMapping("/fridge")
    public String getUserFridge(Model model) {
        model.addAttribute("fridgeProd", fridgeService.list());
        return "fridge";
    }

    @GetMapping("/deleteFridgeItem/{itemId}")
    public String deleteItemFridge(@PathVariable("id") Long itemId) {
        fridgeService.delete(itemId);
        return "redirect:/user/fridge";
    }

    @GetMapping("/categories")
    public String getCategories() {
        return "categories";
    }

}