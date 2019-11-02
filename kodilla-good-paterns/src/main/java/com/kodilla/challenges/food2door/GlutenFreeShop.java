package com.kodilla.challenges.food2door;

public class GlutenFreeShop implements Producer {


    @Override
    public boolean process (Order order) {
        if (order.getProduct().equals(null) || order.getAmount()==0) {
            System.out.println("Out of stock");
            return false;
        }
        return true;
    }


}
