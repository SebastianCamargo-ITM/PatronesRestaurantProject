package models.orders;

import models.orders.template.FoodOrder;

public class PastaOrder extends FoodOrder{

    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing Pasta ingredients");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking Pasta");
    }

    @Override
    protected void serve() {
        System.out.println("Serving Pasta");
    }
}
