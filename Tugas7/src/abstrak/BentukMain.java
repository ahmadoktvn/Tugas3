package abstrak;

public class BentukMain {
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran(10);
        Tabung tab = new Tabung(10, 5);
        System.out.println("== Lingkaran ==");
        System.out.println("jari2 : "+ ling.getJari2());
        System.out.println("luas : "+ ling.luas());

        System.out.println("== Tabung ==");
        System.out.println("jari2 : "+ tab.getJari2() + "," + "Tinggi : " + tab.getTinggi());
        System.out.println("luas : " + tab.luas());
    }
}
