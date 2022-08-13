package abstractfactorypattern.carabstraction;

public class AudiCar implements Car{
    @Override
    public void create() {
        System.out.println("AudiCar Audi markasının maşın növüdür.");
    }
}
