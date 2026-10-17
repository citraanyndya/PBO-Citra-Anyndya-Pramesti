package TugasPraktikum05;

public class Ayam extends Hewan {
    public Ayam() {
        super();
    }

    public Ayam(int jumlahKaki, boolean isBerbulu, boolean jenisKelamin) {
        super(jumlahKaki, isBerbulu, jenisKelamin);
    }

    public void berkokok() {
        System.out.println("Ayam berkokok: Kukuruyukk petok petok");
    }

    @Override
    public void tampilInfo() {
        System.out.println("Informasi Mengenai Ayam");
        super.tampilInfo();
    }
}
