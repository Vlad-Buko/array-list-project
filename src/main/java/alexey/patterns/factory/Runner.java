package alexey.patterns.factory;

import alexey.patterns.factory.model.Car;

public class Runner {
    public static void main(String[] args) {
        Car car1 = createCar("Red", "WBAET37808NJ28452");
        Car car2 = createCar("Black", "WBAET37852AP554508");
        System.out.println(car1.getColor() + " " + car1.getVin());
        System.out.println(car2.getColor() + " " + car2.getVin());
    }

    private static Car createCar(String color, String vin) {
        return Car.builder()
                .color(color)
                .vin(vin)
                .build();
    }
}
