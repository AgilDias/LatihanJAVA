package com.agildias;

public class HitungSegitiga {

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(20);
        segitiga.setTinggi(15);
        segitiga.setSisi(10);

        System.out.println("Luas : "+ segitiga.getLuas());
        System.out.println("Keliling : "+segitiga.getKeliling());

    }

}
