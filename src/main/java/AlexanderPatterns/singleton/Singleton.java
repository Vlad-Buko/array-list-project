package AlexanderPatterns.singleton;

import java.util.logging.Logger;

public class Singleton {
    private static Singleton instance = null;
    private static Logger log = Logger.getLogger(Singleton.class.getName());
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
    public void setUp() {
        log.info("setUp");
    }

}
