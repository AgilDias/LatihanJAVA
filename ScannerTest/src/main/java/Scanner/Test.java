package Scanner;

import java.util.Scanner;

class Test {
    public static void main (String[] args){
        Scanner inp=new Scanner(System.in);
        Mahasiswa mah=new Mahasiswa();
        String nama,status,NomorHp,Kelas;
        System.out.println(" : : : : inputan data mahasiswa : : : : ");
        System.out.println("\n");
        System.out.print("nama             : ");
        nama=inp.next();
        System.out.print("status           : ");
        status=inp.next();
        System.out.print("Nomor HP         : ");
        NomorHp=inp.next();
        System.out.print("Kelas            : ");
        Kelas=inp.next();
        System.out.print("NIM(angka)       : ");
        mah.nim=inp.next();
        System.out.print("Nilai UTS(angka) : ");
        mah.nuts=inp.nextInt();
        System.out.print("Nilai UAS(angka) : ");
        mah.nuas=inp.nextInt();
        mah.setData(nama, status,NomorHp, Kelas);
        mah.getData();
        mah.getDataMahasiswa();

    }
}
