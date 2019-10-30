package com.kodilla.challenges.allegro;

public class Main {
    public static void main (String[] args) {
        PurchaseRequestRetriever purchaseRequestRetriever = new PurchaseRequestRetriever();
        PurchaseRequest purchaseRequest = purchaseRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService (
                new MailService(), new WeaponPurchaseService(), new WeaponPurchaseRepository());
        productOrderService.process(purchaseRequest);
    }
}
