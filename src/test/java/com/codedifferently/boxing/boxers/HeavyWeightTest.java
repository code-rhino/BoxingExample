package com.codedifferently.boxing.boxers;

import org.junit.Assert;
import org.junit.Test;

public class HeavyWeightTest {

    @Test
    public void createHeavyWeight(){
        // Given
        String name = "Myke Tyson";

        /// When
        HeavyWeight heavyWeight = new HeavyWeight(name);
        String expectedName = "Myke Tyson";
        String actualName = heavyWeight.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void attackTest01(){
        // Given
        HeavyWeight boxer1 = new HeavyWeight("Myke");
        HeavyWeight boxer2 = new HeavyWeight("JoJo");

        //When
        boxer1.attack(boxer2);
        Integer currentStamina = 35;
        Integer actualStamina = boxer2.getStamina();

        //Then
        Assert.assertTrue(actualStamina < currentStamina );

    }
}
