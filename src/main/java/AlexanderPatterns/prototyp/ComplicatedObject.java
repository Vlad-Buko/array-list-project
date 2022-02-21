package AlexanderPatterns.prototyp;

import java.util.logging.Logger;

public class ComplicatedObject implements Copyable {
    private static Logger log = Logger.getLogger(ComplicatedObject.class.getName());
    public String name;

    public ComplicatedObject(String name) {
        this.name = name;
    }

    @Override
    public Copyable copy() {
        ComplicatedObject complicatedobject = new ComplicatedObject(name);
        return complicatedobject;
    }
    public void setUp() {
        log.info("AlexanderPrototype");
    }

}
