package factorypattern;

public class Hp implements Computer{
    @Override
    public void start() {
        System.out.println("Bilgisayarın Markası Hp");
    }
}
