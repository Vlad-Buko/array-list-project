package vladislav.templates.abstractFactory.main;

import vladislav.templates.abstractFactory.interfaceModel.Color;
import vladislav.templates.abstractFactory.interfaceModel.Drive;
import vladislav.templates.abstractFactory.interfaceModel.Speed;
import vladislav.templates.abstractFactory.model.CarColor;
import vladislav.templates.abstractFactory.model.CarDrive;
import vladislav.templates.abstractFactory.model.CarSpeed;

public class CarFactory implements FactoryInterface {
    public CarFactory() {
        System.out.println("Implementation car class");
    }

    @Override
    public Color createColor() {
        System.out.println("Create car color");
        return new CarColor();
    }

    @Override
    public Drive createDrive() {
        System.out.println("Create car drive");
        return new CarDrive();
    }

    @Override
    public Speed createValueSpeed() {
        System.out.println("Create car speed");
        return new CarSpeed();
    }
}
