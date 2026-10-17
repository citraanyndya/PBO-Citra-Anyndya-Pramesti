package TokoLippies;
import java.time.LocalDate;

public class PesananLippies {
    private String idPesanan;
    private LocalDate tanggalPesanan;
    private Pelanggan pelanggan;
    private LipKitBundle bundleYangDibeli;
    private Lippies lipEceran;
    private String metodeBayar;

    public PesananLippies(String idPesanan, LocalDate tanggalPesanan, Pelanggan pelanggan, LipKitBundle bundleYangDibeli, Lippies lipEceran, String metodeBayar) {
        this.idPesanan = idPesanan;
        this.tanggalPesanan = tanggalPesanan;
        this.pelanggan = pelanggan;
        this.bundleYangDibeli = bundleYangDibeli;
        this.lipEceran = lipEceran;
        this.metodeBayar = metodeBayar;
    }

    public double hitungTotalBayar() {
    if (bundleYangDibeli != null) {
        return bundleYangDibeli.hitungHargaBundle();
    } else {
        return lipEceran.getHarga();
    }
}

    public void tampilkanInfoPesanan() {
    System.out.println("ID Pesanan    : " + idPesanan);
    System.out.println("Tanggal       : " + tanggalPesanan);
    System.out.println("Nama Pelanggan: " + pelanggan.getNama());

    if (bundleYangDibeli != null) {
        System.out.println("Daftar Pesanan: " + bundleYangDibeli.getNamaBundle());
    } else {
        System.out.println("Daftar Pesanan: " + lipEceran.getShadeLippies());
    }

    System.out.println("Total Harga   : Rp " + hitungTotalBayar());
}
}
