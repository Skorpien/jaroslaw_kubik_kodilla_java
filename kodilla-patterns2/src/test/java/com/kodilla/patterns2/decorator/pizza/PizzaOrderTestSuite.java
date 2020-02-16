package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    private PizzaOrder theOrder = new BasicPizzaOrder();

    @Test
    public void testBasicPizzaOrderCost() {
        //Given
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(20), cost);
    }

    @Test
    public void testBasicPizzaOrderDescription() {
        //Given
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Standard Pizza with cheese and tomato sauce", description);
    }

    @Test
    public void testPizzaOrderWithOnionCost() {
        //Given
        theOrder = new OnionDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(23), cost);
    }

    @Test
    public void testPizzaOrderWithOnionDescription() {
        //Given
        theOrder = new OnionDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Standard Pizza with cheese and tomato sauce + onion", description);
    }

    @Test
    public void testPizzaOrderWithAllIngredientsCost() {
        //Given
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        //When
        BigDecimal cost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(31), cost);
    }

    @Test
    public void testPizzaOrderWithAllIngredientsDescription() {
        //Given
        theOrder = new HamDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Standard Pizza with cheese and tomato sauce + ham + mushrooms + onion", description);
    }
}
