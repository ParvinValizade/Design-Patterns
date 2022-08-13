package abstractfactorypattern.motorcycleabstraction;

public class AudiMotorCycle implements MotorCycle{
    @Override
    public void create() {
        System.out.println("AudiMotorCycle Audi markasının  motorcycle növüdür.");
    }
}
