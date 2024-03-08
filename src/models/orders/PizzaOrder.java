package models.orders;

import models.orders.template.FoodOrder;

public class PizzaOrder extends FoodOrder {
    @Override
    protected void prepareIngredients() {
        System.out.println("Preparing Pizza ingredients");
    }

    @Override
    protected void cook() {
        System.out.println("Cooking Pizza");
    }

    @Override
    protected void serve() {
        System.out.println("Serving Pizza");
    }

    @Override
    protected boolean customerWantsExtra() {
        return true;
    }
}