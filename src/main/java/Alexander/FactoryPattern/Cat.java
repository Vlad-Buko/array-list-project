package Alexander.FactoryPattern;

import Alexander.FactoryPattern.Astronaut;

public class Cat extends Astronaut {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return  name;
    }

}