package models.facade;

import interfaces.IngredientProvider;
import interfaces.PaymentStrategy;
import interfaces.Product;
import models.inventory.Chef;
import models.inventory.Inventory;
import models.orders.OrderRegistry;
import models.orders.PastaOrder;
import models.orders.PizzaOrder;
import models.orders.template.FoodOrder;
import models.payment.CashPaymentStrategy;
import models.payment.CreditCardPaymentStrategy;
import models.products.factory.ProductFactory;

public class RestaurantFacade {

    public void placeOrder(String order, String payMethod, int money) {
        OrderRegistry orderRegistry = OrderRegistry.getInstance();
        orderRegistry.addOrder(order);
        orderRegistry.displayOrders();

        IngredientProvider inventory = new Inventory();
        Chef chef = new Chef(inventory);
        chef.displayIngredients();

        // Factory Method
        Product product = ProductFactory.createProduct(order);
        product.prepare();

        // Strategy
        PaymentStrategy paymentStrategy;
        if (payMethod == "Credit") {
            paymentStrategy = new CreditCardPaymentStrategy();
        } else {
            paymentStrategy = new CashPaymentStrategy();
        }
        paymentStrategy.pay(money);

        // Template Method
        FoodOrder foodOrder;
        if (order.equalsIgnoreCase("Pizza")) {
            foodOrder = new PizzaOrder();
        } else if (order.equalsIgnoreCase("Pasta")) {
            foodOrder = new PastaOrder();
        } else {
            throw new IllegalArgumentException("Unknown dish: " + order);
        }
        foodOrder.processOrder();
    }
}
