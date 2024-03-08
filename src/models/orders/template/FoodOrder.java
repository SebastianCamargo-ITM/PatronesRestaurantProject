package models.orders.template;

// Template Method para la preparación de alimentos
public abstract class FoodOrder {
    public final void processOrder() {
        prepareIngredients();
        cook();
        serve();
        if (customerWantsExtra()) {
            addExtra();
        }
    }

    protected abstract void prepareIngredients();

    protected abstract void cook();

    protected abstract void serve();

    void addExtra() {
        System.out.println("Extra added!");
    }

    protected boolean customerWantsExtra() {
        return false;
    }
}