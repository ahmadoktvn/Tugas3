package latihan_interface;
public class Sepeda implements Kendaraan{
    private String nama;

    public Sepeda(String nama) {
        this.nama = nama;
    }

    public void berjalan() {
        System.out.println(nama + " berjalan dengan digoes");
    }
}
