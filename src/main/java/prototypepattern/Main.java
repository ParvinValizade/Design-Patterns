package prototypepattern;

public class Main {
    public static void main(String[] args){

        Soldier availableSoldier = new Soldier(100,45,20,50,60,5,
                "Kılıç",true);

        Soldier notAvailableSoldier = availableSoldier.clone();
        notAvailableSoldier.setAvailableForWar(false);

        availableSoldier.showSoldierInfo();
        System.out.println("--");
        notAvailableSoldier.showSoldierInfo();
    }
}
