package builderpattern;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .door("Demir qapi")
                .roof("Italyan dami").build();

        System.out.println(house);
    }
}
