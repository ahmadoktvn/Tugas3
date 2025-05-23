public class MatakuliahMain {
    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        System.out.println("---Daftar Mata Kuliah---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("--- Nilai IPK ---");
        double totalNilai = 0;
        int totalSks = 0;

        totalNilai += mk1.nilaiIndex() * mk1.getSks();
        totalSks += mk1.getSks();
        totalNilai += mk2.nilaiIndex() * mk2.getSks();
        totalSks += mk2.getSks();
        totalNilai += mk3.nilaiIndex() * mk3.getSks();
        totalSks += mk3.getSks();

        double ipk = totalNilai / totalSks;

        System.out.printf("Nilai IPK Anda adalah : %.2f\n", ipk);
    }
}
