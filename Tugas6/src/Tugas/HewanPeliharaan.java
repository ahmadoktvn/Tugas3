package Tugas;

public class HewanPeliharaan {
    protected String nama;
    protected int umur;

    HewanPeliharaan(String nama,int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void display() {
        System.out.println("Nama : "+ nama);
        System.out.println("Umur : "+ umur + " Tahun");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}
