package io.zipcoder.polymorphism;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

        private static final Logger LOGGER = Logger.getLogger(MainApplication.class.getName());
        Integer numberOfAnimals;
        Dog dog;
        Cat cat;
        Fish fish;
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<Pet, String> mapOfPets = new LinkedHashMap<>();
        ArrayList<Pet> listOfPets = new ArrayList<>();
        String[] petTypes = {"dog", "cat", "fish"};

        public String getUserInput() {
            String toReturn = scanner.nextLine();
            return toReturn.toLowerCase();
        }

        public Integer getUserNumber() {
            return scanner.nextInt();
        }

        public void addPetToList(Pet newPet) {
            listOfPets.add(newPet);
        }

        public Integer getNumberOfAnimals() {
            boolean conditional = false;
            while(!conditional) {
                try {
                    System.out.println("How many pets do you have?");
                    String tempNumberOfPets = getUserInput();
                    numberOfAnimals = Integer.parseInt(tempNumberOfPets);
                    conditional = true;
                } catch (NumberFormatException e) {
                    System.out.println("You must input a number");
                }
            }
            System.out.println("Okay, you have " + numberOfAnimals + " pets!\n");
            return numberOfAnimals;
        }

        public Pet getType() {
            System.out.println("Dog / Cat / Fish");
            System.out.println("What type of pet do you have? : ");

            Pet mystery = null;
            String answer = scanner.nextLine();
            String stringToCheck = answer.toLowerCase();

            boolean conditional = false;
            while (!conditional) {
                if (stringToCheck.equals("dog")) {
                    mystery = new Dog();
                    conditional = true;
                } else if (stringToCheck.equals("cat")) {
                    mystery = new Cat();
                    conditional = true;
                } else if (stringToCheck.equals("fish")) {
                    mystery = new Fish();
                    conditional = true;
                } else {
                    System.out.println("No that is not a type of pet. Please try again. : ");
                    stringToCheck = getUserInput();
                }
            }
            return mystery;
        }

        public String getName() {
            System.out.println("What is you pet's name?");
            String petName = getUserInput();
            return petName;
        }


        /*public void getName() {
            boolean conditional = false;
            while (!conditional) {

            }
        }*/
        /*public void getTypeAndName() {
            for (int i = 0; i < numberOfAnimals; i++) {
                System.out.println("Please enter your animal type and name with a space between.");
                String a = scanner.nextLine();
                String[] userInput = a.split(" ");
                String petType = userInput[0];
                String petName = userInput[1];


                if (petType.equals(petTypes[0])) {
                    dog = new Dog();
                    dog.setName(petName);
                    listOfPets.add(dog);
                } else if (petType.equals(petTypes[1])) {
                    cat = new Cat();
                    cat.setName(petName);
                    listOfPets.add(cat);
                } else {
                    fish = new Fish();
                    fish.setName(petName);
                    listOfPets.add(fish);
                }
            }
        }*/

        public void makeSpeak() {
            for (Pet element : listOfPets) {
                element.speak();
            }
        }

        public static void main(String[] args) {
            MainApplication user = new MainApplication();

            user.getNumberOfAnimals();

            for (int i = 0; i < user.numberOfAnimals; i++) {
                Pet userPet = user.getType();
                String petName = user.getName();
                userPet.setName(petName);
                user.addPetToList(userPet);
            }
            user.makeSpeak();
    }
}
