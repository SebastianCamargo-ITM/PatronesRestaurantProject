package models.products;

import interfaces.Product;

public class Pasta implements Product {
    @Override
    public void prepare() {
        System.out.println("Preparing Pasta");
    }
}