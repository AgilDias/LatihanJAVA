package com.agildias;

public class Segitiga {

    private double luas;
    private double alas;
    private double tinggi;
    private double keliling;
    private double sisi;


    public double getLuas() {
        luas = 0.5 * alas * tinggi;
        return luas;
    }

    public double getKeliling() {
        keliling = alas + tinggi + sisi;
        return keliling;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
