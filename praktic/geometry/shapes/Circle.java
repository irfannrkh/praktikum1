/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.shapes;

/**
 *
 * @author Lenovo
 */
// + kelas circle (tanda + merupakan public)
public class Circle {
    private int id; // - int id
    private double radius; // - double radius
    private final int pembilang = 22; // - int pembilang, langsung deklarasi nialinya  ( final menunjukkan valuenya tidak dapat diubah)
    private final int penyebut = 7;// - int penyebut, langsung deklarasi nilainya ( final menunjukkan valuenya tidak dapat diubah)

    // Konstruktor tanpa parameter
    public Circle() {
    }

    // Setter ID void
    public void setId(int id) {
        this.id = id;
    }

    // method Setter Radius void
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // method Getter Keliling typenya harus double
    public double getKeliling() {
        return ((double) pembilang / penyebut) * 2 * radius;
    }

    // method Getter Luas typenya harus double
    public double getLuas() {
        return ((double) pembilang / penyebut) * radius * radius;
    }

    // Method untuk print deskripsi ( ini bdasarkan gambar yang di kirim)
    public void printDeskripsi() {
        System.out.println("ID       : " + id); // memunculkan nila id
        System.out.println("Radius   : " + radius); // memunculkan nila radius
        System.out.println("Keliling : " + getKeliling()); // memunculkan nilai keliling sesuai rumus yang di method getter kel
        System.out.println("Luas     : " + getLuas()); // memunculkan nilai luas sesuai rumus yang di tulis di method getter luas
    }

    public void getId(double nextDouble) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
