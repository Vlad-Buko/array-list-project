package Alexander.FactoryPattern;

import Alexander.FactoryPattern.Astronaut;

public class Dog extends Astronaut {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return  name;
    }

}
