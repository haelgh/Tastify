package com.tastify.digitalReceipts.model.recipe.information;

import java.util.Arrays;

public enum Aisle {
    BAKING("Baking"),
    HEALTH("Health Foods"),
    SEASONING("Spices and Seasonings"),
    PASTA_RICE("Pasta and Rice"),
    BAKERY_BREAD("Bakery/Bread"),
    REFRIGERATED("Refrigerated"),
    CANNED("Canned and Jarred"),
    FROZEN("Frozen"),
    BUTTER_JAM_HONEY("Nut butters, Jams, and Honey"),
    DRESSING("Oil, Vinegar, Salad Dressing"),
    CONDIMENTS("Condiments"),
    SAVORY_SNACKS("Savory Snacks"),
    EGGS_DIARY("Milk, Eggs, Other Dairy"),
    ETHNIC("Ethnic Foods"),
    TEA_COFFEE("Tea and Coffee"),
    MEAT("Meat"),
    GOURMET("Gourmet"),
    SWEETS("Sweet Snacks"),
    GLUTEN_FREE("Gluten Free"),
    ALCOHOL("Alcoholic Beverages"),
    CEREAL("Cereal"),
    NUTS("Nuts"),
    BEVERAGES("Beverages"),
    PRODUCE("Produce"),
    NOT_IN_GROCERY_HOMEMADE("Not in Grocery Store/Homemade"),
    SEAFOOD("Seafood"),
    CHEESE("Cheese"),
    DRIED_FRUITS("Dried Fruits"),
    ONLINE("Online"),
    GRILLING_SUPPLIES("Grilling Supplies"),
    BREAD("Bread");

    private String category;

    Aisle(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
