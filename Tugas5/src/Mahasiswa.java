public class Mahasiswa {

    private String NRP;
    private String nama;

    public Mahasiswa() {

    }

    public Mahasiswa(String nRP, String nama) {
        super();
        NRP = nRP;
        this.nama = nama;
    }

    public String display() {
        return "NRP : "+ NRP + " Nama : " + nama;
    }

    // Setter & Getter
    public void setNRP(String NRP) {
        this.NRP = NRP;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNRP() {
        return NRP;
    }

    public String getNama() {
        return nama;
    }
}