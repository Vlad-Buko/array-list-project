package vladislav.templates.abstractFactory.main;

import vladislav.templates.abstractFactory.interfaceModel.Color;
import vladislav.templates.abstractFactory.interfaceModel.Drive;
import vladislav.templates.abstractFactory.interfaceModel.Speed;


public class OrderCarForm {
    final Color createColorField;
    final Drive createDriveVariable;
    final Speed createSetSpeed;

    public OrderCarForm(FactoryInterface factory) {
        System.out.println("Creating order form");
        createColorField = factory.createColor();
        createDriveVariable = factory.createDrive();
        createSetSpeed = factory.createValueSpeed();
    }
}
