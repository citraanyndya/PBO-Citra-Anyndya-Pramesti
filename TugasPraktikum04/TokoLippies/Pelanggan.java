package TokoLippies;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noTelp;

    public Pelanggan(String idPelanggan, String nama, String noTelp) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelp = noTelp;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void tampilkanInfo() {
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Nama         : " + nama);
        System.out.println("No Telp      : " + noTelp);
    }
}