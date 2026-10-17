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

    public String getShadeLippies() {
        return shadeLippies;
    }

    public void setShadeLippies(String shadeLippies) {
        this.shadeLippies = shadeLippies;
    }

    public String getJenisLippies() {
        return jenisLippies;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilkanInfoLip() {
        System.out.println("  - " + jenisLippies + " (" + shadeLippies + ") - Rp " + (int) harga);
    }
}
