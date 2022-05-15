package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User seba = new Millenials("Hubert");
        User natka = new YGeneration("Olga");
        User domi = new ZGeneration("Paweł");

        //When
        String sebaSocialNetwork = seba.sharePost();
        System.out.println("Hubert share posts on " + sebaSocialNetwork);
        String natkaSocialNetwork = natka.sharePost();
        System.out.println("Olga share posts on " + natkaSocialNetwork);
        String domiSocialNetwork = domi.sharePost();
        System.out.println("Paweł share posts on " + domiSocialNetwork);

        //Then
        Assertions.assertEquals("Facebook", sebaSocialNetwork);
        Assertions.assertEquals("Twitter", natkaSocialNetwork);
        Assertions.assertEquals("Snapchat", domiSocialNetwork);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User Hubert = new Millenials("Hubert");

        //When
        String HubertSocialNetwork = Hubert.sharePost();
        System.out.println("Hubert share posts on " + HubertSocialNetwork);
        Hubert.setSocialNetwork(new SnapchatPublisher());
        HubertSocialNetwork = Hubert.sharePost();
        System.out.println("Now Hubert share posts on " + HubertSocialNetwork);

        //Then
        Assertions.assertEquals("Snapchat", HubertSocialNetwork);
    }
}