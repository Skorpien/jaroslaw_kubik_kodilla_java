package com.kodilla.challenges.allegro;

import java.time.LocalDateTime;

public class PurchaseRequestRetriever {

    public PurchaseRequest retrieve () {
        User user = new User("Han", "Solo");

        LocalDateTime dateOfPurchase = LocalDateTime.of(2019, 10, 12, 15, 35);
        Product product = new Product("Blaster", 1500.0);

        return new PurchaseRequest(user, dateOfPurchase, product);
    }

}
