package Inheritance;

public class Main {
    public static void main(String[] args) {
        Enemy monster = new Enemy();
        Zombie zumbi = new Zombie();
        zumbi.name = "BuldoserEdan";
        zumbi.hp = 100;
        zumbi.attackPoin = 90;
        zumbi.attack();
        if(zumbi.isDead()) {
            System.out.println("Game Over!");
        }
        zumbi.walk();
        Pocong hantuPocong = new Pocong();
        Burung garuda = new Burung();

    }
}
