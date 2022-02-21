package vladislav.templates.abstractFactory.main;

import vladislav.templates.abstractFactory.model.CarColor;

public class Application {
    private OrderCarForm orderCarForm;

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
