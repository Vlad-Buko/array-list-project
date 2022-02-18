package alexey.patterns.strategy;

import alexey.patterns.strategy.model.Cat;
import alexey.patterns.strategy.model.Dog;
import alexey.patterns.strategy.model.Parrot;
import alexey.patterns.strategy.model.Pet;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Stream;

public class Runner {
    public static Logger log;

    public static void main(String[] args) {
        Map<String, Pet> homePets = new HashMap<>();
        homePets.put("Jack", new Dog(15));
        homePets.put("Bobik", new Dog(20));
        homePets.put("Murka", new Cat(10));
        homePets.put("Barsik", new Cat(12));
        homePets.put("Gosha", new Parrot(1));
        homePets.put("Zhora", new Parrot(2));

        printPets(homePets);

        printKeySet(homePets);
        printEntrySet(homePets);
    }

    private static void printPets(Map<String, Pet> homePets) {
        for (Pet pet : homePets.values()) {
            pet.display();
            System.out.println("My weight is " + pet.getWeight() + " kg");
            pet.performMove();
            pet.performVoice();
        }
    }

    private static void printEntrySet(Map<String, Pet> homePets) {
        System.out.println(homePets.entrySet());
    }

    private static void printKeySet(Map<String, Pet> homePets) {
        System.out.println(homePets.keySet());
    }

}
