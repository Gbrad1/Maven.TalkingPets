package io.zipcoder.polymorphism;

public class Fish extends Pet{
    String name;

    @Override
    public void speak() {
        System.out.println(super.getName() + " the fish, says YEET?");
    }
}
