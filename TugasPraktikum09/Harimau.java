package TugasPraktikum09;

public class Harimau implements Moveable {
    @Override
    public void maju() {
        System.out.println("Harimau berjalan maju menyusuri hutan");
    }

    @Override
    public void berhenti() {
        System.out.println("Harimau berhenti melangkah dan siap menerkam mangsa");
    }

    public void bersuara() {
        System.out.println("Harimau mengaum melihat mangsa : rawrrr");
    }

    public void makan() {
        System.out.println("Harimau sedang makan daging buruan");
    }
}