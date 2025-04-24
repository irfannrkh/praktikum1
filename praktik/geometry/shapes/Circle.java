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
public class Circle extends CircularShape implements TwoDimensional {
    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return getPi() * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * getPi() * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Name       : Circle");
        System.out.printf("Area       : %.2f\n", getArea());
        System.out.printf("Perimeter  : %.2f\n", getPerimeter());
    }
}
