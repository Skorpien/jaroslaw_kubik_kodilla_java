package com.kodilla.challenges.food2door;

public class HealthyShop implements Producer {
    private String producerName;
    private Product product;
    private int amount;

    public HealthyShop(String producerName, Product product, int amount) {
        this.producerName = producerName;
        this.product = product;
        this.amount = amount;
    }

    @Override
    public boolean process (Order order) {
        if (order.getProduct()==product || order.getAmount()>amount) {
            System.out.println("Out of stock");
            return false;
        }
        return true;
    }

    public String getProducerName() {
        return producerName;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
