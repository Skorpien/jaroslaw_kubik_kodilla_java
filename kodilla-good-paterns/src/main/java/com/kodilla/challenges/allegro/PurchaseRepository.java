package com.kodilla.challenges.allegro;

import java.time.LocalDateTime;

public interface PurchaseRepository {
    boolean createPurchase (User user, LocalDateTime dateOfPurchase, Product product);
}
