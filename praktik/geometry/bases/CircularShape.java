/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik.geometry.bases;

/**
 *
 * @author Lenovo
 */
 // class abstrak CircularShape turunan dari Shape
public abstract class CircularShape extends Shape {
    protected double radius;  // Atribut radius bisa diakses oleh subclass
    protected final int PI_NUMERATOR = 22; // final itu tetap nilainya
    protected final int PI_DENOMINATOR = 7; // final itu tetap nilainya

    // Konstruktor default tanpa parameter
    public CircularShape() {}

    // Method setter untuk mengatur nilai radius
    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    // Method getter untuk mengambil nilai radius
    public double getRadius() {
        return radius;
    }

     // Method protected untuk menghitung dan mengembalikan nilai π (phi)
    // gunakan pembagian PI_NUMERATOR / PI_DENOMINATOR, yaitu 22/7
    protected double getPi() {
        return (double) PI_NUMERATOR / PI_DENOMINATOR;
    }
}
