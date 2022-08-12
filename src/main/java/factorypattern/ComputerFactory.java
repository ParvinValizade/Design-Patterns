package factorypattern;

public class ComputerFactory {

    public Computer getComputer(String computerType){
        if (computerType == null){
            return null;
        }
        if (computerType.equalsIgnoreCase("HP")){
            return new Hp();
        }
        else if (computerType.equalsIgnoreCase("ASUS")){
            return new Asus();
        }
        else if (computerType.equalsIgnoreCase("MAC")){
            return new Mac();
        }
        return null;
    }
}
