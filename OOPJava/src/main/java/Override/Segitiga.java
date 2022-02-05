package Override;

public class Segitiga extends BangunDatar {
    float alas;
    float tinggi;
    @Override
    float luas() {
        float luas =  (alas * tinggi)/2;
        System.out.println("Luas Segitiga: " + luas);
        return luas;
    }
}

// karena segita ada banyak jenis maka keliling tidak di tulis