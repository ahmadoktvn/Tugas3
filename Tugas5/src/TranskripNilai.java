import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        super();
        this.mahasiswa = mahasiswa;

        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalNilai = 0;
        int totalSks = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            for (Matakuliah mk : khs.getDaftarMatakuliah()) {
                totalNilai += mk.nilaiIndex() * mk.getSks();
                totalSks += mk.getSks();
            }
        }

        if (totalSks > 0) {
            this.ipk = totalNilai / totalSks;
        } else {
            this.ipk = 0;
        }
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak : " + tglCetak.toString());
        System.out.printf("IPK : %.2f\n", ipk);
        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    //Setter & Getter
    public void setTglCetak(Date tglCetak) {
        this.tglCetak = tglCetak;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public void setKartuHasilStudi(List<KartuHasilStudi> kartuHasilStudi) {
        this.kartuHasilStudi = kartuHasilStudi;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    public Date getTglCetak() {
        return tglCetak;
    }

    public double getIpk() {
        return ipk;
    }

    public List<KartuHasilStudi> getKartuHasilStudi() {
        return kartuHasilStudi;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

}
