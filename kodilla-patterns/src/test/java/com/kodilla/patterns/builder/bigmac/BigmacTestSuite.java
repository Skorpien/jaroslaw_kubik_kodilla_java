package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                        .bun(PossibleBuns.SESAMEBUN)
                        .burgers(3)
                        .sauce(PossibleSauces.BARBECUE)
                        .ingredient(PossibleIngredients.BACON)
                        .ingredient(PossibleIngredients.CHEESE)
                        .ingredient(PossibleIngredients.ONION)
                        .ingredient(PossibleIngredients.CHILIPEPPERS)
                        .build();
        //When
        int howMany = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(4, howMany);
        Assert.assertEquals("BARBECUE", bigmac.getSauce());
        Assert.assertEquals("SESAME BUN", bigmac.getBun());

    }
}
