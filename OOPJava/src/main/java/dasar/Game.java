package dasar;

public class Game {
    public static void main(String[] args) {
        Player Dota = new Player();

        Dota.name="Jugger ";
        Dota.speed=45;
        Dota.healthPoint=0;

        Dota.run();
        if(Dota.isDead()) {
            System.out.println("Game Over!");
        }
    }
}
