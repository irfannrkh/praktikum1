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

//  class utama namanya ShapeCalculator
public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

         // print header sesuai di contoh output
        System.out.println("============================================");
        System.out.println("Shape Calculator");
        System.out.println("MUKHAMAD IRFAN NUR KHAKIM");
        System.out.println("245150701111021");
        System.out.println("============================================");

        // Circle
        System.out.println("2D Circle");
        System.out.println("============================================");
        System.out.print("Enter radius     : ");
        double radius = input.nextDouble(); // Membaca input radius
        Circle circle = new Circle(radius); // Membuat objek Circle
        System.out.println("============================================");
        circle.printInfo(); // print informasi Circle luas & keliling

        // Square
        System.out.println("============================================");
        System.out.println("2D Square");
        System.out.println("============================================");
        System.out.print("Enter side       : ");
        double side = input.nextDouble(); // Membaca input sisi persegi
        Square square = new Square(side); // Membuat objek Square
        System.out.println("============================================");
        square.printInfo(); // print informasi Square

        // Cube
        System.out.println("============================================");
        System.out.println("3D Weightable Cube");
        System.out.println("============================================");
        System.out.print("Enter edge       : ");
        double edge = input.nextDouble(); //Membaca panjang sisi kubus
        System.out.print("Enter mass       : ");
        double cubeMass = input.nextDouble(); // Membaca massa kubus
        Cube cube = new Cube(edge, cubeMass); // Membuat objek Cube
        System.out.println("============================================");
        cube.printInfo(); // print tentang Cube 

        // Sphere
        System.out.println("============================================");
        System.out.println("3D Weightable Sphere");
        System.out.println("============================================");
        System.out.print("Enter radius     : ");
        double radius2 = input.nextDouble(); //Membaca jari-jari bola
        System.out.print("Enter mass       : ");
        double sphereMass = input.nextDouble(); // Membaca massa bola
        Sphere sphere = new Sphere(radius2, sphereMass); // Membuat objek Sphere
        System.out.println("============================================");
        sphere.printInfo(); // print tentang Sphere

        // Polymorphism Interface
        System.out.println("============================================");
        System.out.println("Volume of Cube and Sphere");
        System.out.println("POLYMORPHISM: INTERFACE");
        System.out.println("============================================");
        System.out.print("Enter edge       : ");
        double edge2 = input.nextDouble(); // Input sisi kubus (untuk polymorphism)
        System.out.print("Enter radius     : ");
        double radius3 = input.nextDouble(); // Input jari-jari bola (untuk polymorphism)
        System.out.print("Enter mass       : ");
        double mass2 = input.nextDouble(); // Input massa untuk menghitung berat
        ThreeDimensional polyCube = new Cube(edge2, mass2);   // Menggunakan polymorphism yang objeknya interface ThreeDimensional
        ThreeDimensional polySphere = new Sphere(radius3, mass2);

        // Objek bertipe interface Weightable 
        Weightable weight = new Cube(0, mass2); // hanya butuh mass untuk weight

        System.out.println("============================================");
        System.out.printf("Cube’s volume    : %.2f\n", polyCube.getVolume());
        System.out.printf("Sphere’s volume  : %.2f\n", polySphere.getVolume());
        System.out.printf("Weight           : %.2f\n", weight.getWeight());
        System.out.println("============================================");
    }
}
