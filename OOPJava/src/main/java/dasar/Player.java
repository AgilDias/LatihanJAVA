package dasar;

public class Player {
    String name;
    int speed;
    int healthPoint;

    void run(){
        System.out.println(name+"is running ...");
        System.out.println("speed: "+speed);
    }
    boolean isDead(){
        if(healthPoint <= 0) return true;
        return false;
    }

}
