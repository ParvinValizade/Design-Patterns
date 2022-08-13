package abstractfactorypattern.motorcycleabstraction;

public class BMWMotorCycle implements MotorCycle{
    @Override
    public void create() {
        System.out.println("BMWMotorCycle BMW markasının  motorcycle növüdür.");
    }
}
