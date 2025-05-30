package latihan_interface;
public class Motor implements Kendaraan{
    private String nama;

    public Motor(String nama) {
        this.nama = nama;
    }

    public void berjalan() {
        System.out.println(nama + " berjalan dengan mesin");
    }
}
