package Scanner;

class Manusia {
    public String nama,status,nomorhp,kelas;
    void setData (String nama, String Status, String NomorHp,String Kelas) {
        this.nama = nama;
        this.status = Status;
        this.nomorhp = NomorHp;
        this.kelas = Kelas;
    }

    void getData (){
        System.out.println("+++++ Data Manusia +++++");
        System.out.println();
        System.out.println("nama          : "+nama);
        System.out.println("STATUS        : "+status);
        System.out.println("Nomor HP      : "+nomorhp);
        System.out.println("Kelas         : "+kelas);
    }

}
