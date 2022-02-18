package Alexander.FactoryPattern;

import Alexander.FactoryPattern.*;

import java.util.ArrayList;

public class Main {

    public static void pilot (Human human)
    {
        System.out.println("Член экипажа " + human.getInfo() + " пилотирует корабль.");
    }

    public static void createDirection(Dog dog) {
        System.out.println("Член экипажа " + dog.getInfo() + " занимается созданием маршрута.");
    }

    public static void research(Cat cat) {
        System.out.println("Член экипажа " + cat.getInfo() + " исследует ближайшие планеты.");
    }


    public static void main(String[] args) {
        ArrayList<Astronaut> astronautArrayList = new ArrayList<>();
        astronautArrayList.add(AstronautFactory.createAstronaut(AstronautType.Dog));
        astronautArrayList.add(AstronautFactory.createAstronaut(AstronautType.Human));
        astronautArrayList.add(AstronautFactory.createAstronaut(AstronautType.Cat));

        for (Astronaut astronaut : astronautArrayList)
        {
            if (astronaut instanceof Human)
            {
                Human human = (Human) astronaut;
                pilot(human);
            }
            if (astronaut instanceof Cat)
            {
                Cat cat = (Cat) astronaut;
                research(cat);
            }
            if(astronaut instanceof Dog)
            {
                Dog dog = (Dog) astronaut;
                createDirection(dog);
            }
        }


    }

}
