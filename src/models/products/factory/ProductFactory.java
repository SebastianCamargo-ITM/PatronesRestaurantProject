package models.products.factory;

import interfaces.Product;
import models.products.Pasta;
import models.products.Pizza;

// Factory Method para crear productos
public class ProductFactory {
    public static Product createProduct(String type) {
        switch (type.toLowerCase()) {
            case "pizza":
                return new Pizza();
            case "pasta":
                return new Pasta();
            default:
                throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}
