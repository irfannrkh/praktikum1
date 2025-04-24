/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktik.geometry.mains;
import praktik.geometry.shapes.*;
import java.util.Scanner;
import praktik.geometry.interfaces.ThreeDimensional;
import praktik.geometry.interfaces.Weightable;
/**
 *
 * @author Lenovo
 */


public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("Shape Calculator");
        System.out.println("MUKHAMAD IRFAN NUR KHAKIM");
        System.out.println("245150701111021");
        System.out.println("============================================");

        // Circle
        System.out.println("2D Circle");
        System.out.println("============================================");
        System.out.print("Enter radius     : ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("============================================");
        circle.printInfo();

        // Square
        System.out.println("============================================");
        System.out.println("2D Square");
        System.out.println("============================================");
        System.out.print("Enter side       : ");
        double side = input.nextDouble();
        Square square = new Square(side);
        System.out.println("============================================");
        square.printInfo();

        // Cube
        System.out.println("============================================");
        System.out.println("3D Weightable Cube");
        System.out.println("============================================");
        System.out.print("Enter edge       : ");
        double edge = input.nextDouble();
        System.out.print("Enter mass       : ");
        double cubeMass = input.nextDouble();
        Cube cube = new Cube(edge, cubeMass);
        System.out.println("============================================");
        cube.printInfo();

        // Sphere
        System.out.println("============================================");
        System.out.println("3D Weightable Sphere");
        System.out.println("============================================");
        System.out.print("Enter radius     : ");
        double radius2 = input.nextDouble();
        System.out.print("Enter mass       : ");
        double sphereMass = input.nextDouble();
        Sphere sphere = new Sphere(radius2, sphereMass);
        System.out.println("============================================");
        sphere.printInfo();

        // Polymorphism Interface
        System.out.println("============================================");
        System.out.println("Volume of Cube and Sphere");
        System.out.println("POLYMORPHISM: INTERFACE");
        System.out.println("============================================");
        System.out.print("Enter edge       : ");
        double edge2 = input.nextDouble();
        System.out.print("Enter radius     : ");
        double radius3 = input.nextDouble();
        System.out.print("Enter mass       : ");
        double mass2 = input.nextDouble();
        ThreeDimensional polyCube = new Cube(edge2, mass2);
        ThreeDimensional polySphere = new Sphere(radius3, mass2);
        Weightable weight = new Cube(0, mass2); // hanya butuh mass untuk weight

        System.out.println("============================================");
        System.out.printf("Cube’s volume    : %.2f\n", polyCube.getVolume());
        System.out.printf("Sphere’s volume  : %.2f\n", polySphere.getVolume());
        System.out.printf("Weight           : %.2f\n", weight.getWeight());
        System.out.println("============================================");
    }
}