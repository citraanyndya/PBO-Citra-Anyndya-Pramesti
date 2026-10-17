package TugasPraktikum05;

public class Kambing extends Hewan {
    public boolean isBertanduk;

    public Kambing() {
        super();
        this.isBertanduk = false;
    }

    public Kambing(int jumlahKaki, boolean isBerbulu, boolean jenisKelamin, boolean isBertanduk) {
        super(jumlahKaki, isBerbulu, jenisKelamin);
        this.isBertanduk = isBertanduk;
    }

    @Override
    public void tampilInfo() {
        System.out.println("Informasi Mengenai Kambing");
        super.tampilInfo();
        System.out.println("Apakah Bertanduk: " + (isBertanduk ? "Ya" : "Tidak"));
    }
}
