package TokoLippies;

public class Lippies {
    private String idLippies;
    private String shadeLippies;
    private String jenisLippies;
    private double harga;

    public Lippies(String idLippies, String shadeLippies, String jenisLippies, double harga) {
        this.idLippies = idLippies;
        this.shadeLippies = shadeLippies;
        this.jenisLippies = jenisLippies;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public String getShadeLippies() {
        return shadeLippies;
    }

    public String getJenisLippies() {
        return jenisLippies;
    }

    public void tampilkanInfoLip() {
        System.out.println("  - " + jenisLippies + " (" + shadeLippies + ") - Rp " + (int) harga);
    }
}