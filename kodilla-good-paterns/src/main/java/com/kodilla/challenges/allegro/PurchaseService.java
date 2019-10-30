package com.kodilla.challenges.allegro;

import java.time.LocalDateTime;

public interface PurchaseService {

    boolean purchase (User user, LocalDateTime dateOfPurchase, Product product);
}
