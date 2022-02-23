package vladislav.templates.abstractFactory.main;


public class Application {
    OrderCarForm orderCarForm;

    public void drawOrderSomethingForm(String something) {

        FactoryInterface factoryInterface;
        if (something.startsWith("audi")) {
            factoryInterface = new CarFactory();
        } else if (something.startsWith("bmw")) {
            factoryInterface = new MotorcycleFactory();
        } else {
            System.out.println("Unknown, can't draw form :( ");
            return;
        }
        orderCarForm = new OrderCarForm(factoryInterface);
    }
    public static void main(String[] args) {
        Application application = new Application();
        application.drawOrderSomethingForm("bmw");
    }
}
