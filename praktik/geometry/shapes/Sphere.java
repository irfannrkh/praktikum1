/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik.geometry.shapes;
import praktik.geometry.bases.CircularShape;
import praktik.geometry.interfaces.ThreeDimensional;
import praktik.geometry.interfaces.Weightable;
/**
 *
 * @author Lenovo
 */
public class Sphere extends CircularShape implements ThreeDimensional, Weightable {
    private double mass;  // atribut massa untuk menghitung berat

    public Sphere() {} // Konstruktor(tanpa parameter)

    // Konstruktor dengan parameter radius dan mass
    public Sphere(double radius, double mass) {
        this.radius = radius; // Mengisi atribut radius dari superclass CircularShape
        this.mass = mass; // Mengisi atribut massa
    }

    @Override
     // Override method getSurfaceArea dari interface ThreeDimensional
    public double getSurfaceArea() {
         // Rumus luas permukaan bola = 4πr^2
        return 4 * getPi() * radius * radius;
    }

    @Override
     // Override method getVolume dari interface ThreeDimensional
    public double getVolume() {
        return (4.0 / 3.0) * getPi() * radius * radius * radius; // Rumus volume bola = 4/3 π r^3

    }

    @Override
    // Override method getWeight dari interface Weightable
    public double getWeight() {
       // Berat = massa * gravitasi
        return mass * GRAVITY;
    }

     // Override method printInfo dari superclass atau interface
    @Override
    public void printInfo() {
        System.out.println("Name         : Sphere"); // print nama bentuk
        System.out.printf("Surface area : %.2f\n", getSurfaceArea()); // print luas permukaan
        System.out.printf("Volume       : %.2f\n", getVolume()); // print volume
        System.out.printf("Weight       : %.2f\n", getWeight()); // print berat
    }
}
