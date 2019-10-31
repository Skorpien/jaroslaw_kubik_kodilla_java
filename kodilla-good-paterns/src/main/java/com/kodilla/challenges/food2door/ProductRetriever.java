package com.kodilla.challenges.food2door;

public class ProductRetriever {

    public Order retrieve () {
        Product product = new Product("Zmioki");

        return new Order (product, 800);
    }
}
