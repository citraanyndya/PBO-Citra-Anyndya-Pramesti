package TokoLippies;
import java.util.ArrayList;

public class LipKitBundle {
    private String idBundle;
    private String namaBundle;
    private double persenDiskon;
    private ArrayList<Lippies> daftarLippie;

    public LipKitBundle(String idBundle, String namaBundle, double persenDiskon) {
        this.idBundle = idBundle;
        this.namaBundle = namaBundle;
        this.persenDiskon = persenDiskon;
        this.daftarLippie = new ArrayList<>();
    }

    public void tambahLippiesKeBundle(Lippies lippies) {
        this.daftarLippie.add(lippies);
    }

    public double hitungHargaNormal() {
        double totalNormal = 0;
        for (Lippies lip : daftarLippie) {
            totalNormal += lip.getHarga();
        }
        return totalNormal;
    }

    public double hitungHargaBundle() {
        double normal = hitungHargaNormal();
        return normal - (normal * (persenDiskon / 100.0));
    }

    public String getNamaBundle() {
        return namaBundle;
    }

    public void tampilInfoBundle() {
        System.out.println("Nama Bundle  : " + namaBundle);
        for (Lippies lip : daftarLippie) {
            lip.tampilkanInfoLip();
        }
    }
}