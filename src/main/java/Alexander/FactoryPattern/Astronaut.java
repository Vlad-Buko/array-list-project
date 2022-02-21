package Alexander.FactoryPattern;

public abstract class Astronaut {
    public String name;

    Astronaut(String name) {
        this.name = name;
    }
    public abstract String getInfo ();

}
