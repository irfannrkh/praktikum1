/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedial.shapes;
import remedial.bases.BangunRuang; // Import abstract class
import remedial.interfaces.MemilikiVolume; // Import interface volume
import remedial.interfaces.MemilikiBerat; // Import interface berat
import remedial.interfaces.MemilikiGarisPelukis; // Import interface garis pelukis
/**
 *
 * @author Lenovo
 */


// Class Kerucut turunan dari BangunRuang dan implementasi 3 interface
public class Kerucut extends BangunRuang implements MemilikiVolume, MemilikiBerat, MemilikiGarisPelukis {
    private double radius; // Jari-jari kerucut
    private final int PI_PEMBILANG = 22; // Nilai pembilang pi
    private final int PI_PENYEBUT = 7; // Nilai penyebut pi

    // Constructor untuk inisialisasi radius
    public Kerucut(double radius) {
        this.radius = radius;
    }

    // Method untuk mengambil nilai radius
    public double getRadius() {
        return radius;
    }

    // Implementasi method hitungVolume dari interface
    @Override
    public double hitungVolume() {
        return (double) PI_PEMBILANG / PI_PENYEBUT * radius * radius * tinggi / 3;
    }

    // Implementasi method hitungBerat dari interface
    @Override
    public double hitungBerat() {
        return massa * g; // Berat = massa * gravitasi
    }

    // Implementasi method hitungGarisPelukis dari interface
    @Override
    public double hitungGarisPelukis() {
        return Math.sqrt(radius * radius + tinggi * tinggi); // Rumus pitagoras
    }

    // Implementasi printInfo sesuai format output
    @Override
    public void printInfo() {
        System.out.println("===============================================");
        System.out.println("Nama              : " + nama);
        System.out.println("Radius            : " + radius);
        System.out.println("Tinggi            : " + tinggi);
        System.out.println("Massa             : " + massa);
        System.out.println("Volume            : " + hitungVolume());
        System.out.println("Berat             : " + hitungBerat());
        System.out.println("Garis pelukis     : " + hitungGarisPelukis());
        System.out.println("===============================================");
    }
}