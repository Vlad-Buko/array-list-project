package vladislav.templates.abstractFactory.main;

import vladislav.templates.abstractFactory.interfaceModel.Color;
import vladislav.templates.abstractFactory.interfaceModel.Drive;
import vladislav.templates.abstractFactory.interfaceModel.Speed;
import vladislav.templates.abstractFactory.model.CarColor;
import vladislav.templates.abstractFactory.model.CarDrive;
import vladislav.templates.abstractFactory.model.CarSpeed;

public class CarFactory implements FactoryInterface {
    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(OrderCarForm.class);
    public CarFactory() {
        logger.info("Implementation car class");
    }

    @Override
    public Color createColor() {
        logger.info("Create car color");
        return new CarColor();
    }

    @Override
    public Drive createDrive() {
        logger.info("Create car drive");
        return new CarDrive();
    }

    @Override
    public Speed createValueSpeed() {
        logger.info("Create car speed");
        return new CarSpeed();
    }
}
