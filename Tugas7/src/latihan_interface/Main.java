package latihan_interface;
public class Main {
    public static void main(String[] args) {
        Kendaraan motor = new Motor("Motor Beat");
        Kendaraan sepeda = new Sepeda("Sepeda BMX");

        System.out.println("Kendaraan Berjalan : ");
        motor.berjalan();
        sepeda.berjalan();
    }
}
