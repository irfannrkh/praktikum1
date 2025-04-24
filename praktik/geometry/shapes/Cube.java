/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik.geometry.shapes;
import praktik.geometry.bases.Shape;
import praktik.geometry.interfaces.ThreeDimensional;
import praktik.geometry.interfaces.Weightable;

/**
 *
 * @author Lenovo
 */

// Class Cube adalah subclass dari Shape dan mengimplementasikan interface ThreeDimensional dan Weightable
public class Cube extends Shape implements ThreeDimensional, Weightable {
    private double edge;
    private double mass;

    public Cube() {} // Konstruktor(tanpa parameter)

    // Konstruktor untuk menginisialisasi sisi dan massa kubus
    public Cube(double edge, double mass) {
        this.edge = edge; // panjang sisi
        this.mass = mass;  //  massa
    }

    @Override 
     // Override method dari interface ThreeDimensional
    public double getSurfaceArea() {
        return 6 * edge * edge; //  luas permukaan kubus = 6 * sisi^2
    }

    @Override
    // Override method dari interface ThreeDimensional
    public double getVolume() {
        return edge * edge * edge; // volume = sisi^3
    }

    @Override
    // Override method dari interface Weightable
    public double getWeight() {
        return mass * GRAVITY; // gravitasi didefinisikan di interface Weightable
    }

    @Override
    // Override method printInfo dari class Shape
    // print info kubus
    public void printInfo() {
        System.out.println("Name         : Cube"); // print nama
        System.out.printf("Surface area : %.2f\n", getSurfaceArea()); // print luas permukaan
        System.out.printf("Volume       : %.2f\n", getVolume()); // print volume
        System.out.printf("Weight       : %.2f\n", getWeight()); // print berat

    }
}
