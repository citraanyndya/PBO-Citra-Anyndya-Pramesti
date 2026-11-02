package TugasPraktikum05;

public class HewanMain {
    public static void main(String[] args) {
        Ayam ayam1 = new Ayam(2, true, true);
        Kambing kambing1 = new Kambing(4, false, false, false);

        System.out.println("Informasi Mengenai Ayam");
        ayam1.tampilInfo();
        ayam1.berkokok();

        System.out.println();

        System.out.println("Informasi Mengenai Kambing");
        kambing1.tampilInfo();
        System.out.println("Apakah Bertanduk: " + (kambing1.isBertanduk ? "Ya" : "Tidak"));
    }
}