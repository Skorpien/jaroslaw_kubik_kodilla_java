package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User bob = new Millenials("Bob");
        User george = new ZGeneration("George");
        User ross = new YGeneration("Ross");

        //When
        String bobSocial = bob.predict();
        String georgeSocial = george.predict();
        String rossSocial = ross.predict();

        //Then
        Assert.assertEquals("Facebook", bobSocial);
        Assert.assertEquals("Twitter", georgeSocial);
        Assert.assertEquals("Snapchat", rossSocial);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User bob = new Millenials("Bob");

        //When
        bob.setSocialPublisher(new TwitterPublisher());
        String bobOrderSocial = bob.predict();

        //Then
        Assert.assertEquals("Twitter", bobOrderSocial);
    }
}
