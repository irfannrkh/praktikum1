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


public class Cube extends Shape implements ThreeDimensional, Weightable {
    private double edge;
    private double mass;

    public Cube() {}

    public Cube(double edge, double mass) {
        this.edge = edge;
        this.mass = mass;
    }

    @Override
    public double getSurfaceArea() {
        return 6 * edge * edge;
    }

    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    @Override
    public double getWeight() {
        return mass * GRAVITY;
    }

    @Override
    public void printInfo() {
        System.out.println("Name         : Cube");
        System.out.printf("Surface area : %.2f\n", getSurfaceArea());
        System.out.printf("Volume       : %.2f\n", getVolume());
        System.out.printf("Weight       : %.2f\n", getWeight());
    }
}
