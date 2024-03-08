package models.inventory;

import java.util.List;

import interfaces.IngredientProvider;

import java.util.ArrayList;

public class Inventory implements IngredientProvider {
    @Override
    public List<String> getIngredients() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("Tomato");
        ingredients.add("Cheese");
        ingredients.add("Flour");
        return ingredients;
    }
}
