package vladislav.templates.abstractFactory;

public class Motorcycle {
    private String speed;
    private int value;
    private String name;


    public Motorcycle(String speed) {
        this.speed = speed;
    }

    public void methodOutClass () {
        System.out.println("Hello");
    }
    public class right {
        public void speed () {

            System.out.println("Upper motor");
        }

        public void getSpeed () {
            System.out.println("Value speed = " + speed);
        }
    }

    public class Left {
        public void arsize ()
        {
            System.out.println("Method two with my likely motorcycle calling");
        }
    }
}
