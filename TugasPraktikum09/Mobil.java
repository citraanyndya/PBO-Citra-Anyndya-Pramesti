package TugasPraktikum09;

public class Mobil implements Moveable {
    @Override
    public void maju() {
        System.out.println("Mobil berjalan maju dengan menginjak gas");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti berjalan.");
    }

    public void klakson() {
        System.out.println("Mobil mengklakson saat di lampu merah : Tin tiinnn");
    }
}