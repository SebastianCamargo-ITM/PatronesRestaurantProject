package models.products;

import interfaces.Product;

public class Pizza implements Product {
    @Override
    public void prepare() {
        System.out.println("Preparing Pizza");
    }
}