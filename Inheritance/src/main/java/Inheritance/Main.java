package Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                String ulg = "y";
                while (ulg.equals("y")) {
                    System.out.println(" ");
                    Scanner input = new Scanner(System.in);
                    System.out.println("***********MARKAS TERNAK*********** ");
                    System.out.println(" ");
                    System.out.println("             MENU UTAMA             ");
                    System.out.println("1. Ikan");
                    System.out.println("2. Sapi");
                    System.out.println("3. STOP");
                    System.out.println("=====================================");
                    System.out.print("Pilihan [1/2/3] = ");
                    int pilih = input.nextInt();
                    System.out.println("=====================================");

                    switch (pilih) {
                        case 1: {
                            ikan paus = new ikan();
                            paus.name ="WHALE";
                            paus.status = "PEMAKAN PLANKTON";
                            paus.makan = "Plankton";
                            paus.umur = "100 tahun";
                            paus.berat = "2 ton";
                            paus.win();
                            paus.swim();
                            paus.magic();
                            break;
                        }
                        case 2: {
                            Sapi banteng = new Sapi();
                            banteng.name = "BANTENG";
                            banteng.status = "BERTANDUK TAJAM";
                            banteng.makan = "Rumput";
                            banteng.umur = "5 tahun";
                            banteng.berat = "1 kwintal";
                            banteng.win();
                            banteng.walk();
                            banteng.skill();
                            banteng.burst();
                            break;
                        }
                        case 3: {
                            System.exit(3);
                            System.out.println("PILIHAN TIDAK SESUAI!");
                        }
                        break;
                    }
                    System.out.println("===========================");
                    System.out.print("Apakah anda ingin mengulang(y/t)?");
                    ulg = input.next();
                }
            }
        }
