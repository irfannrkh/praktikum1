/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik.geometry.bases;

/**
 *
 * @author Lenovo
 */
public abstract class CircularShape extends Shape {
    protected double radius;
    protected final int PI_NUMERATOR = 22;
    protected final int PI_DENOMINATOR = 7;

    public CircularShape() {}

    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    public double getRadius() {
        return radius;
    }

    protected double getPi() {
        return (double) PI_NUMERATOR / PI_DENOMINATOR;
    }
}
