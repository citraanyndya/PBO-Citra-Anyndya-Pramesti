package TokoLippies;

import java.time.LocalDate;

public class PesananLippies {
    private String idPesanan;
    private LocalDate tanggalPesanan;
    private Pelanggan pelanggan;
    private LipKitBundle bundleYangDibeli;
    private String metodeBayar;

    public PesananLippies(String idPesanan, LocalDate tanggalPesanan, Pelanggan pelanggan, LipKitBundle bundleYangDibeli, String metodeBayar) {
        this.idPesanan = idPesanan;
        this.tanggalPesanan = tanggalPesanan;
        this.pelanggan = pelanggan;
        this.bundleYangDibeli = bundleYangDibeli;
        this.metodeBayar = metodeBayar;
    }

    public double hitungTotalBayar() {
        return bundleYangDibeli.hitungHargaBundle();
    }

    public void tampilkanInfoPesanan() {
        System.out.println("Data Pesanan di Toko Lippies Anin");
        System.out.println("ID Pesanan     : " + idPesanan);
        System.out.println("Tanggal        : " + tanggalPesanan);
        System.out.println("Nama Pelanggan : " + pelanggan.getNama());
        System.out.println("Daftar Pesanan : " + bundleYangDibeli.getNamaBundle());
        System.out.println("Total Harga    : Rp " + (int) hitungTotalBayar());
    }
}