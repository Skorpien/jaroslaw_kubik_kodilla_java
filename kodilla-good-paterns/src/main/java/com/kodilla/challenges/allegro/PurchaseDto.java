package com.kodilla.challenges.allegro;

public class PurchaseDto {
    private User user;
    private boolean isPurchased;

    public PurchaseDto (User user, boolean isPurchased) {
        this.user = user;
        this.isPurchased = isPurchased;
    }

    public User getUser () {
        return user;
    }

    public boolean isPurchased () {
        return isPurchased;
    }
}
