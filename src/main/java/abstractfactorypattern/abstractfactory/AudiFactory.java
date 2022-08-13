package abstractfactorypattern.abstractfactory;

import abstractfactorypattern.carabstraction.AudiCar;
import abstractfactorypattern.carabstraction.Car;
import abstractfactorypattern.motorcycleabstraction.AudiMotorCycle;
import abstractfactorypattern.motorcycleabstraction.MotorCycle;

public class AudiFactory extends AbstractFactory{
    @Override
    public Car createCar() {
        return new AudiCar();
    }

    @Override
    public MotorCycle createMotorCycle() {
        return new AudiMotorCycle();
    }
}
