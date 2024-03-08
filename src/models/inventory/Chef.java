package models.inventory;

import java.util.List;

import interfaces.IngredientProvider;

public class Chef {
    private IngredientProvider ingredientProvider;

    public Chef(IngredientProvider ingredientProvider) {
        this.ingredientProvider = ingredientProvider;
    }

    public void displayIngredients() {
        List<String> ingredients = ingredientProvider.getIngredients();
        System.out.println("Available Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println(ingredient);
        }
    }
}