package io.zipcoder.polymorphism;

public class Dog extends Pet{
    String name;

    @Override
    public void speak() {
        System.out.println(super.getName() + " the Dog, says Bark!");
    }

}
