package builderpattern;

public class Main {
    public static void main(String[] args) {
        House house = new House.Builder()
                .door("Demir qapi")
                .roof("Italyan dami").build();
        User user = new User();
        user.setFirstName("Anar");
        user.setLastName("Mikayilov");
        System.out.println(user);
        System.out.println(house);
    }
}
