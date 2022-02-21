package Alexander.FactoryPattern.PrototypePattern;

public class PrototypeTest {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject("www");
        ComplicatedObject clone = (ComplicatedObject) prototype.copy();
        ComplicatedObject complicatedObject = new ComplicatedObject("rrr");
        System.out.println(prototype.name);
        System.out.println(clone.name);
        System.out.println(complicatedObject.name);
    }
}
