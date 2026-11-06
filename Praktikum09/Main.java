package Praktikum09;

public class Main {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.merk = "LG";
        tv.harga = 4200000.0;
        tv.warna = "Silver";
        tv.jenisLayar = "OLED";
        tv.volume = 20;

        System.out.println("=== INFORMASI TV  ===");
        tv.getInfo();
        
        tv.turunkanVolume();
        System.out.println("Volume Terkini: " + tv.volume);

        System.out.println();

        Kulkas kulkas = new Kulkas();
        kulkas.merk = "Polytron";
        kulkas.harga = 2800000.0;
        kulkas.warna = "Hitam Glossy";
        kulkas.jumlahPintu = 1;

        System.out.println("=== INFORMASI KULKAS  ===");
        kulkas.getInfo();
    }
}