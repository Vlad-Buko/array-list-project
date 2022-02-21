package AleksanderPrototype;

public class PrototypeTest {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject("Example");
        ComplicatedObject clone = (ComplicatedObject) prototype.copy();
    }
}
