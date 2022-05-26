package vladislav.templates.abstractFactory.main;

import vladislav.templates.abstractFactory.interfaceModel.Color;
import vladislav.templates.abstractFactory.interfaceModel.Drive;
import vladislav.templates.abstractFactory.interfaceModel.Speed;

public interface FactoryInterface {
    Color createColor();
    Drive createDrive();
    Speed createValueSpeed();
}
