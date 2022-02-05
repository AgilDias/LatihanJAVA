package Scanner;

class Mahasiswa extends Manusia {
    public String nim;
    public int nuts,nuas;
    void getDataMahasiswa(){
        System.out.println();
        System.out.println("+++++ Data Mahasiswa +++++");
        System.out.println();
        System.out.println("NIM          : "+nim);
        System.out.println("Nilai UTS    : "+nuts);
        System.out.println("Nilai UAS    : "+nuas);
    }
}
