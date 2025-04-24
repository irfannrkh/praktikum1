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


public class Square extends Shape implements TwoDimensional {
    private double side;

    public Square() {}

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void printInfo() {
        System.out.println("Name       : Square");
        System.out.printf("Area       : %.2f\n", getArea());
        System.out.printf("Perimeter  : %.2f\n", getPerimeter());
    }
}
