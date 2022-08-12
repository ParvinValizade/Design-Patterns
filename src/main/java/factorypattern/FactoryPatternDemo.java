package factorypattern;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();

        //get an object of HP and call its start method.
        Computer computer1 = computerFactory.getComputer("HP");
        computer1.start();

        //get an object of ASUS and call its start method.
        Computer computer2 = computerFactory.getComputer("ASUS");
        computer2.start();

        //get an object of MAC and call its start method.
        Computer computer3 = computerFactory.getComputer("MAC");
        computer3.start();
    }
}
