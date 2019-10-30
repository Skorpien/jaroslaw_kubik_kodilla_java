package com.kodilla.challenges.allegro;

import java.time.LocalDateTime;

public class PurchaseRequest {
    private User user;
    private LocalDateTime dateOfPurchase;
    private Product product;

    public PurchaseRequest(User user, LocalDateTime dateOfPurchase, Product product) {
        this.user = user;
        this.dateOfPurchase = dateOfPurchase;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getDateOfPurchase() {
        return dateOfPurchase;
    }

    public Product getProduct() {
        return product;
    }
}
