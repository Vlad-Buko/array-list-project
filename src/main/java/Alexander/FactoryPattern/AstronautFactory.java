package Alexander.FactoryPattern;

public class AstronautFactory {
    public static Astronaut createAstronaut (AstronautType type)
    {
        Astronaut astronaut = null;
        switch (type)
        {
            case Human:
                astronaut = new Human("Vasa");
                break;
            case Dog:
                astronaut = new Dog("Tedy");
                break;
            case Cat:
                astronaut = new Cat("Jhon");
                break;
        }
        return astronaut;
    }
}
