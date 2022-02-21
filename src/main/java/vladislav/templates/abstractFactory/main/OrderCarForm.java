package vladislav.templates.abstractFactory.main;

import vladislav.templates.abstractFactory.interfaceModel.Color;
import vladislav.templates.abstractFactory.interfaceModel.Drive;
import vladislav.templates.abstractFactory.interfaceModel.Speed;


public class OrderCarForm {
    org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(OrderCarForm.class);
    final Color createColorField;
    final Drive createDriveVariable;
    final Speed createSetSpeed;

    public OrderCarForm(FactoryInterface factory) {
        logger.info("Creating order form");
        createColorField = factory.createColor();
        createDriveVariable = factory.createDrive();
        createSetSpeed = factory.createValueSpeed();
    }
}
