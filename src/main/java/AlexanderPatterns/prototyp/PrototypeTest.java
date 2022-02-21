package AlexanderPatterns.prototyp;

import AlexanderPatterns.singleton.Singleton;

import java.util.logging.Logger;

public class PrototypeTest {
    public static void main(String[] args) {

        ComplicatedObject prototype = new ComplicatedObject("www");
        ComplicatedObject clone = (ComplicatedObject) prototype.copy();
        clone.setUp();



    }
}
