package io.zipcoder.polymorphism;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {
    private static final Logger LOGGER = Logger.getLogger(MainApplication.class.getName());

    public static void main(String[] args) {
        Integer numberOfPets;
        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, ArrayList<Pet>> mapOfPets = new LinkedHashMap<>();
        ArrayList<Pet> listOfPets = new ArrayList<>();
        String[] petTypes = {"dog", "cat", "fish"};

        System.out.println("How many pets do you have?");
        String tempNumberOfPets = scanner.nextLine();
        numberOfPets = Integer.parseInt(tempNumberOfPets);

        System.out.println("Okay, you have " + numberOfPets + " pets!\n");

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("Please enter your animal type and name with a space between.");
            String a = scanner.nextLine();
            String[] parts = a.split(" ");
            String parts1 = parts[0];
            String parts2 = parts[1];
            if (parts1.equals(petTypes[0])) {
                dog.setName(parts2);
                listOfPets.add(dog);
            } else if (parts1.equals(petTypes[1])) {
                cat.setName(parts2);
                listOfPets.add(cat);
            } else {
                fish.setName(parts2);
                listOfPets.add(fish);
            }

        }

        for (Pet element : listOfPets) {
            element.speak();
        }

    }
}
