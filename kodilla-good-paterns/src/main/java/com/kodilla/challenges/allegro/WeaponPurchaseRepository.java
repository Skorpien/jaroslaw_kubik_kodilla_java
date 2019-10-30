package com.kodilla.challenges.allegro;

import java.time.LocalDateTime;

public class WeaponPurchaseRepository implements PurchaseRepository {
    @Override
    public boolean createPurchase(User user, LocalDateTime dateOfPurchase, Product product) {
        return true;
    }
}
