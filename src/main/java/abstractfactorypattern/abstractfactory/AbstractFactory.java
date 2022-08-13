package abstractfactorypattern.abstractfactory;

import abstractfactorypattern.carabstraction.Car;
import abstractfactorypattern.motorcycleabstraction.MotorCycle;

public abstract class AbstractFactory {
    public abstract Car createCar();
    public abstract MotorCycle createMotorCycle();
}
