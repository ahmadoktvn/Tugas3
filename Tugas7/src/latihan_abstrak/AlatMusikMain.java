package latihan_abstrak;
public class AlatMusikMain {
    public static void main(String[] args) {
        Gitar gitar = new Gitar();
        Piano piano = new Piano();

        System.out.println("===Alat Musik : ===");
        System.out.println("Nama Alat Musik : "+gitar.nama);
        gitar.caraMain();

        System.out.println("Nama Alat Musik : "+piano.nama);
        piano.caraMain();
    }
}
