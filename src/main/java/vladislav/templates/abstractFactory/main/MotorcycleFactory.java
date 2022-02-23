package vladislav.templates.abstractFactory.main;

import vladislav.templates.abstractFactory.interfaceModel.Color;
import vladislav.templates.abstractFactory.interfaceModel.Drive;
import vladislav.templates.abstractFactory.interfaceModel.Speed;
import vladislav.templates.abstractFactory.model.MotorcycleColor;
import vladislav.templates.abstractFactory.model.MotorcycleDrive;
import vladislav.templates.abstractFactory.model.MotorcycleSpeed;

public class MotorcycleFactory implements FactoryInterface {
    public MotorcycleFactory() {
        System.out.println("Create form for moto");
    }

    @Override
    public Color createColor() {
        System.out.println("Create moto color");
        return new MotorcycleColor();
    }

    @Override
    public Drive createDrive() {
        System.out.println("Create moto drive");
        return new MotorcycleDrive();
    }

    @Override
    public Speed createValueSpeed() {
        System.out.println("Set moto speed");
        return new MotorcycleSpeed();
    }
}
