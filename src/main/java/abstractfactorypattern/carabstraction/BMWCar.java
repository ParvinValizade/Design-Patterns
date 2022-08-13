package abstractfactorypattern.carabstraction;

public class BMWCar implements Car{
    @Override
    public void create() {
        System.out.println("BMWCar BMW markasının maşın növüdür.");
    }
}
