/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik.geometry.shapes;
import praktik.geometry.bases.Shape;
import praktik.geometry.interfaces.TwoDimensional;
/**
 *
 * @author Lenovo
 */

// class Square sebagai subclass dari Shape dan mengimplementasikan interface TwoDimensional
public class Square extends Shape implements TwoDimensional {
    private double side;
    
// Konstruktor(tanpa parameter)
    public Square() {}

    // Konstruktor dengan parameter panjang sisi
    public Square(double side) {
        this.side = side; // Menginisialisasi atribut side
    }

     // Override method getArea dari interface TwoDimensional
    @Override
    public double getArea() {
        // Rumus luas persegi = sisi * sisi
        return side * side;
    }

    // Override method getPerimeter dari interface TwoDimensional
    @Override
    public double getPerimeter() {
        return 4 * side; // Rumus keliling persegi = 4 * sisi
    }

    @Override  // Override method printInfo untuk mencetak informasi bentuk persegi
    public void printInfo() {
        System.out.println("Name       : Square"); // print nama bentuk
        System.out.printf("Area       : %.2f\n", getArea()); // print luas persegi
        System.out.printf("Perimeter  : %.2f\n", getPerimeter()); // print keliling persegi
    }
}
