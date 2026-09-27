package TokoLippies;
import java.time.LocalDate;

public class LippiesMain {
    public static void main(String[] args) {

        Lippies lip1 = new Lippies("L01", "04. LeadHer", "Lip Cream", 34000);
        Lippies lip2 = new Lippies("L02", "08. Rosy", "Lip Tint", 40000);
        Lippies lip3 = new Lippies("L03", "03. Sassy", "Butter Balm", 32000);

        LipKitBundle bundleSet = new LipKitBundle("B01", "Next Level Lip Complete Set All", 10.0);
        bundleSet.tambahLippiesKeBundle(lip1);
        bundleSet.tambahLippiesKeBundle(lip2);
        bundleSet.tambahLippiesKeBundle(lip3);

        LipKitBundle bundleEceran = new LipKitBundle("B02", "Lip Cream 04. LeadHer (Eceran)", 0.0);
        bundleEceran.tambahLippiesKeBundle(lip1);

        Pelanggan p1 = new Pelanggan("P01", "Nania", "081234567890");
        Pelanggan p2 = new Pelanggan("P02", "Sheyla", "089876543210");

        PesananLippies pesanan1 = new PesananLippies("PES001", LocalDate.of(2026, 3, 27), p1, bundleSet, "QRIS");
        PesananLippies pesanan2 = new PesananLippies("PES002", LocalDate.of(2026, 9, 28), p2, bundleEceran, "Transfer Bank");

        pesanan1.tampilkanInfoPesanan();
        System.out.println("-------------------------------------------");
        pesanan2.tampilkanInfoPesanan();
    }
}