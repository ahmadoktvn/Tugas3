package Latihan4;
public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("202302","Ahmad Oktavian","Cimahi");
        System.out.println(mhs.getNrp()+ "-" +mhs.getNama()+ "-" +mhs.getAlamat());
    }
}
