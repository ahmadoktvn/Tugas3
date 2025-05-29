package Tugas;

public class Main {
    public static void main(String[] args) {
        Anjing anjingSaya = new Anjing("Dogi", 5);
        Kucing kucingSaya = new Kucing("Kity", 2);

        System.out.println("=== Informasi Anjing Saya ===");
        anjingSaya.display();
        anjingSaya.suaraAnjing();

        System.out.println("=== Informasi Kucing Saya ===");
        kucingSaya.display();
        kucingSaya.suaraKucing();
    }
}
