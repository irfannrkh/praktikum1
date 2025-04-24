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
    private double mass;

    public Sphere() {}

    public Sphere(double radius, double mass) {
        this.radius = radius;
        this.mass = mass;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * getPi() * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * getPi() * radius * radius * radius;
    }

    @Override
    public double getWeight() {
        return mass * GRAVITY;
    }

    @Override
    public void printInfo() {
        System.out.println("Name         : Sphere");
        System.out.printf("Surface area : %.2f\n", getSurfaceArea());
        System.out.printf("Volume       : %.2f\n", getVolume());
        System.out.printf("Weight       : %.2f\n", getWeight());
    }
}
