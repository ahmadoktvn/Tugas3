public class Matakuliah {
    private String kode;
    private String nama;
    private String indexNilai;
    private int sks;

    public Matakuliah(String kode,String nama,String indexNilai,int sks) {
        super();
        this.kode = kode;
        this.nama = nama;
        this.indexNilai = indexNilai;
        this.sks = sks;
    }

    public double nilaiIndex() {
        switch (indexNilai) {
            case "A":
                return 4.0;
            case "AB":
                return 3.5;
            case "B":
                return 3.0;
            case "BC":
                return 2.5;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "E":
                return 0.0;
            default:
                return 0;
        }
    }

    public String display() {
        return kode + " - " + nama + " - " + indexNilai;
    }

    public int getSks() {
        return sks;
    }

    public String getIndexNilai() {
        return indexNilai;
    }
}