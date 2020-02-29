package io.zipcoder.polymorphism;

public class Cat extends Pet{
    String name;

    @Override
    public void speak() {
        System.out.println(super.getName() + " the cat, says Meow!");
    }
}
