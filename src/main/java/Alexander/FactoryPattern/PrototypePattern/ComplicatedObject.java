package Alexander.FactoryPattern.PrototypePattern;

public class ComplicatedObject implements Copyable {
    public String name;

    public ComplicatedObject(String name) {
        this.name = name;
    }
    @Override
    public Copyable copy() {
        ComplicatedObject complicatedobject = new ComplicatedObject(name);
        return complicatedobject;
    }



}
