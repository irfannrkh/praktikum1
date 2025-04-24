/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik.geometry.shapes;
import praktik.geometry.bases.CircularShape;
import praktik.geometry.interfaces.TwoDimensional;

/**
 *
 * @author Lenovo
 */
//  class Circle yang merupakan subclass dari CircularShape dan mengimplementasikan interface TwoDimensional
public class Circle extends CircularShape implements TwoDimensional {
    public Circle() {}  // Konstruktor (tanpa parameter)

    public Circle(double radius) {  // Konstruktor dengan parameter radius untuk menginisialisasi jari-jari lingkaran
        this.radius = radius; // atribut radius dari superclass
    }

    @Override // Override method getArea dari interface TwoDimensional
    public double getArea() {
        return getPi() * radius * radius; // Rumus luas lingkaran
    }

    @Override  // Override method getPerimeter dari interface TwoDimensional
    public double getPerimeter() {
        return 2 * getPi() * radius;  // Rumus keliling lingkaran
    }

    @Override
    public void printInfo() {  // Override method printInfo untuk menampilkan informasi tentang lingkaran
        System.out.println("Name       : Circle"); // print nama bentuk
        System.out.printf("Area       : %.2f\n", getArea());  // print luas
        System.out.printf("Perimeter  : %.2f\n", getPerimeter());  // print keliling
    }
}
