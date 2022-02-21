package vladislav.templates.abstractFactory.main;

import vladislav.templates.abstractFactory.interfaceModel.Color;
import vladislav.templates.abstractFactory.interfaceModel.Drive;
import vladislav.templates.abstractFactory.interfaceModel.Speed;
import vladislav.templates.abstractFactory.model.MotorcycleColor;
import vladislav.templates.abstractFactory.model.MotorcycleDrive;
import vladislav.templates.abstractFactory.model.MotorcycleSpeed;

public class MotorcycleFactory implements FactoryInterface {
    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(MotorcycleFactory.class);
    public MotorcycleFactory() {
        logger.info("Create form for moto");
    }

    @Override
    public Color createColor() {
        logger.info("Create moto color");
        return new MotorcycleColor();
    }

    @Override
    public Drive createDrive() {
        logger.info("Create moto drive");
        return new MotorcycleDrive();
    }

    @Override
    public Speed createValueSpeed() {
        logger.info("Set moto speed");
        return new MotorcycleSpeed();
    }
}
