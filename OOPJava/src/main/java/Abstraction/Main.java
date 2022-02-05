package Abstraction;

public class Main {
    public static void main(String[] args) {
// membuat objek dari class Triangle
        Shape segitiga = new Triangle(4, 5);
        Shape lingkaran = new Circle(10);
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
    }
}
