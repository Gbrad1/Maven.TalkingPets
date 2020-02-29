package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Logger;

public class PetTest {

    Pet currentPet = new Pet();
    Dog currentDog = new Dog();
    Fish currentFish = new Fish();
    Cat currentCat = new Cat();

    private static final Logger LOGGER = Logger.getLogger(PetTest.class.getName());

    @Test
    public void setName() {
        currentPet.setName("Kali");
        String a = currentPet.getName();

        Assert.assertEquals(a,"Kali");
    }

    @Test
    public void getName() {
        currentPet.setName("Lilli");
        String a = currentPet.getName();

        Assert.assertEquals(a, "Lilli");
    }

    @Test
    public void dogSpeakTest() {
        currentDog.speak();
    }

    @Test
    public void fishSpeakTest() {
        currentFish.speak();
    }

    @Test
    public void catSpeakTest() {
        currentCat.speak();
    }
}
