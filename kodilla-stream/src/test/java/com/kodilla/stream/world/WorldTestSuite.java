package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country spain = new Country("Spain", new BigDecimal("45000000"));
        Country ghana = new Country("Ghana", new BigDecimal("5000000"));
        Country rsa = new Country("RSA", new BigDecimal("10000000"));
        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(spain);
        Continent africa = new Continent("Africa");
        africa.addCountry(ghana);
        africa.addCountry(rsa);
        world.addContinent(europe);
        world.addContinent(africa);

        //When
        BigDecimal totalQuantity = world.getPeopleQuantity();

        //Then
        BigDecimal expect = new BigDecimal("100000000");
        Assert.assertEquals(expect, totalQuantity);
    }
}
