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
}
