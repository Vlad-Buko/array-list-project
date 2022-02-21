package AleksanderPrototype;

import AleksanderPrototype.ComplicatedObject;

public class PrototypeTest {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject("www");
        ComplicatedObject clone = (ComplicatedObject) prototype.copy();
        ComplicatedObject complicatedObject = new ComplicatedObject("rrr");

    }
}
