package TugasPraktikum09;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();

        System.out.println("Aksi Mengenai Mobil");
        mobil.maju();
        mobil.klakson();
        mobil.berhenti();

        System.out.println();

        Harimau harimau = new Harimau();

        System.out.println("Aksi Mengenai Harimau");
        harimau.maju();
        harimau.bersuara();
        harimau.makan();
        harimau.berhenti();
    }
}