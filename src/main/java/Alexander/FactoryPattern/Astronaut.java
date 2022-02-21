package Alexander.FactoryPattern;

public abstract class Astronaut {
    public String name;

    private Astronaut(String name) {
        this.name = name;
    }
    public abstract String getInfo ();

}
