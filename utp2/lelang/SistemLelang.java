/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp2.lelang;
import utp2.lelang.barang.*;
/**
 *
 * @author Lenovo
 */
public class SistemLelang {
    public static void main(String[] args) {
        Peserta[] peserta = {
            new Peserta("Andi", 9000000),
            new Peserta("Budi", 25000000),
            new Peserta("Iwan", 30000000),
            new Peserta("Dina", 10000000),
            new Peserta("Eka", 5000000)
        };

        BarangLelang[] barang = {
            new Elektronik("Kamera DSLR Canon", 4000000, 2),
            new Seni("Lukisan Abstrak Modern", 8000000, "Seniman Lokal"),
            new Elektronik("Smart TV 55 Inch", 7000000, 2),
            new Seni("Patung Liberty Mini", 3000000, "Unknown Artist")
        };

        // Lelang 1
        barang[0].mulaiLelang();
        peserta[1].tawar(barang[0], 4500000);
        peserta[3].tawar(barang[0], 5000000);
        peserta[0].tawar(barang[0], 5500000);
        peserta[1].tawar(barang[0], 6000000);
        barang[0].tutupLelang();
        peserta[2].tawar(barang[0], 6500000);

        System.out.println("\n====================================\n");

        // Lelang 2
        barang[1].mulaiLelang();
        peserta[4].tawar(barang[1], 7000000);
        peserta[1].tawar(barang[1], 9000000);
        peserta[2].tawar(barang[1], 10000000);
        barang[1].tutupLelang();

        System.out.println("\n====================================\n");

        // Lelang 3
        barang[2].mulaiLelang();
        peserta[2].tawar(barang[2], 7500000);
        peserta[1].tawar(barang[2], 8000000);
        peserta[3].tawar(barang[2], 8500000);
        peserta[2].tawar(barang[2], 8000000);
        peserta[4].tawar(barang[2], 9000000);
        peserta[2].tawar(barang[2], 9500000);
        barang[2].tutupLelang();

        System.out.println("\n====================================\n");

        // Lelang 4
        barang[3].mulaiLelang();
        peserta[4].tawar(barang[3], 4000000);
        peserta[3].tawar(barang[3], 4500000);
        peserta[1].tawar(barang[3], 5000000);
        peserta[4].tawar(barang[3], 4500000);
        barang[3].tutupLelang();
        peserta[0].tawar(barang[3], 5500000);
    }
}