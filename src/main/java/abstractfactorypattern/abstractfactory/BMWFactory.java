package abstractfactorypattern.abstractfactory;

import abstractfactorypattern.carabstraction.BMWCar;
import abstractfactorypattern.carabstraction.Car;
import abstractfactorypattern.motorcycleabstraction.BMWMotorCycle;
import abstractfactorypattern.motorcycleabstraction.MotorCycle;

public class BMWFactory extends AbstractFactory{
    @Override
    public Car createCar() {
        return new BMWCar();
    }

    @Override
    public MotorCycle createMotorCycle() {
        return new BMWMotorCycle();
    }
}
