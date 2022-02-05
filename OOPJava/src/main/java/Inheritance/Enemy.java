package Inheritance;

import java.util.Scanner;

class Enemy {
    String name;
    int hp;
    int attackPoin;


    void attack(){
        System.out.println(name+" Serang!");
        System.out.println("HealthPoint: "+hp);
        System.out.println("attack: "+attackPoin);
    }
    boolean isDead(){
        if(hp <= 0) return true;
        return false;
    }
}


