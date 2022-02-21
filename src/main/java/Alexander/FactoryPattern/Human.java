package Alexander.FactoryPattern;

import Alexander.FactoryPattern.Astronaut;

public class Human extends Astronaut {
    public Human(String name) {
        super(name);
    }

    @Override
    public String getInfo() {
        return  name;
    }


}
