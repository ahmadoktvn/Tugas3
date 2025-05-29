package Tugas;

class Anjing extends HewanPeliharaan {
    Anjing(String nama, int umur) {
        super(nama, umur);
    }

    void suaraAnjing() {
        System.out.println("Suara : " + getNama() + " Menggonggong");
    }
}
