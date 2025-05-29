package Tugas;

class Kucing extends HewanPeliharaan {
    Kucing(String nama, int umur) {
        super(nama, umur);
    }

    void suaraKucing() {
        System.out.println("Suara : " + getNama() + " Meong - Meong");
    }
}
