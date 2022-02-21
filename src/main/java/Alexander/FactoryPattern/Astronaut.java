package Alexander.FactoryPattern;

public abstract class Astronaut {
    public String name;

    public Astronaut(String name) {
        this.name = name;
    }
    public abstract String getInfo ();

}
