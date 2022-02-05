package MencobaIfElse;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        int counter = 0;
        int pin;
        int counterb = 3;
        Scanner in = new Scanner(System.in);
        while (counter < 3) {
            System.out.print("Masukkan PIN anda (3 KALI KESEMPATAN): ");
            pin = in.nextInt();
            if (pin == 2323) {
                System.out.println("SELAMAT ANDA TELAH BERHASIL LOGIN");
                break;
            } else {
                counter++;
            }
            if (counter == 3) {
                System.out.println("MAAF, Akun anda telah DIBLOKIR karena gagal memasukkan pin sebanyak "+ counter + " Kali");
            } else {
                System.out.println("MAAF PIN ANDA SALAH, kesempatan " + counterb + " Kali" + " anda telah memasukkan " + counter + " kali");
            }
        }
    }
}

