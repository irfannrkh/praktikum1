/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedial.shapes;
import remedial.bases.BangunRuang; // Import abstract class
import remedial.interfaces.MemilikiVolume; // Import interface volume
import remedial.interfaces.MemilikiBerat; // Import interface berat
/**
 *
 * @author Lenovo
 */
// Class Balok turunan dari BangunRuang dan implementasi 2 interface
public class Balok extends BangunRuang implements MemilikiVolume, MemilikiBerat {
    private double panjang; // Panjang balok
    private double lebar; // Lebar balok

    // Constructor untuk inisialisasi panjang dan lebar
    public Balok(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk mengambil panjang
    public double getPanjang() {
        return panjang;
    }

    // Method untuk mengambil lebar
    public double getLebar() {
        return lebar;
    }

    // Implementasi method hitungVolume dari interface
    @Override
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Implementasi method hitungBerat dari interface
    @Override
    public double hitungBerat() {
        return massa * g; // Berat = massa * gravitasi
    }

    // Implementasi printInfo sesuai format output
    @Override
    public void printInfo() {
        System.out.println("===============================================");
        System.out.println("Nama              : " + nama);
        System.out.println("Panjang           : " + panjang);
        System.out.println("Lebar             : " + lebar);
        System.out.println("Tinggi            : " + tinggi);
        System.out.println("Massa             : " + massa);
        System.out.println("Volume            : " + hitungVolume());
        System.out.println("Berat             : " + hitungBerat());
        System.out.println("===============================================");
    }
}
