import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        double totalNilai = 0;
        int totalSks = 0;
    
        for (Matakuliah mk : daftarMatakuliah) {
            totalNilai += mk.nilaiIndex() * mk.getSks();
            totalSks += mk.getSks();
        }
    
        if (totalSks > 0) {
            this.ips = totalNilai / totalSks;
        } else {
            this.ips = 0;
        }
    }

    // Setter & Getter
    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setIps(double ips) {
        this.ips = ips;
    }

    public void setDaftarMatakuliah(List<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }

    public String getSemester() {
        return semester;
    }

    public double getIps() {
        return ips;
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}
