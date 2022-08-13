package abstractfactorypattern;

import abstractfactorypattern.abstractfactory.AbstractFactory;
import abstractfactorypattern.abstractfactory.AudiFactory;
import abstractfactorypattern.abstractfactory.BMWFactory;
import abstractfactorypattern.carabstraction.Car;
import abstractfactorypattern.motorcycleabstraction.MotorCycle;

public class Main {
    public static void main(String[] args) {
        AbstractFactory audiFactory = new AudiFactory(); //Factory1

        Car audiCar = audiFactory.createCar();
        MotorCycle audiMotorCycle = audiFactory.createMotorCycle();
        audiCar.create();
        audiMotorCycle.create();

        System.out.println("--------------------");

        AbstractFactory bmwFactory = new BMWFactory(); //Factory2

        Car bmwCar = bmwFactory.createCar();
        MotorCycle bmwMotorCycle = bmwFactory.createMotorCycle();
        bmwCar.create();
        bmwMotorCycle.create();
    }
}
