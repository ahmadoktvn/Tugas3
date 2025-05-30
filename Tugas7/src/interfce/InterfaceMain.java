package interfce;
public class InterfaceMain {
    public static void main(String[] args) {
        KartuElektronik kartu = new KartuElektronik("IF111", "111");
        System.out.println("Otentikasi : "+ kartu.otentikasi("123"));
    }
}
