package com.kodilla.challenges.food2door;

public class Food2DoorMain {
    public static void main (String[] args) {
        ProductRetriever productRetriever = new ProductRetriever();
        Order order = productRetriever.retrieve();
        Purchase purchase = new Purchase();
        purchase.makeOrder(new GlutenFreeShop().process(order));

    }
}
