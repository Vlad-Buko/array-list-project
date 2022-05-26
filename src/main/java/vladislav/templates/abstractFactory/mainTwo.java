package vladislav.templates.abstractFactory;

public class mainTwo {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("300");
        Motorcycle.Left something = motorcycle.new Left();
        Motorcycle.right some = motorcycle.new right();

        something.arsize();
        some.getSpeed();
        motorcycle.methodOutClass();
        some.speed();
    }
}
