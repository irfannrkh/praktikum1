/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.mains;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner; // biar mengaktifkan scanner
import praktic.geometry.shapes.Circle; // biar terhubung sama file class circle
import praktic.geometry.shapes.Rectangle;

public class Main {
    static String WHITE = "\u001B[0m"; // Static string pewarna tulisan
    static String GREEN = "\u001B[32m";// Static string pewarna tulisan

    // Static method untuk mencetak garis
    static void printGaris() {
        System.out.println("=======================================");
    }

    public static void main(String[] args) {
        
        

        // buat output Nama, NIM, dan judul (Circle) 
        printGaris();
        System.out.println("Nama : Mukhamad Irfan Nur Khakim");
        System.out.println("NIM  : 245150701111021");
        printGaris();
        System.out.println("Circle");
        printGaris();
        
        Scanner scan = new Scanner(System.in);
        
        Circle circle = new Circle();
       
        // Input untuk Circle
        System.out.print("Isikan ID Lingkaran      : ");
        circle.setId((int) scan.nextDouble());
        System.out.print("Isikan Radius Lingkaran  : ");
        circle.setRadius(scan.nextDouble());
        printGaris();
        
        circle.printDeskripsi();
        printGaris();
        System.out.println("Rectangle");
        printGaris();
        // Input untuk Rectangle
        System.out.print("Isikan ID Persegi Panjang : ");
        int idR = scan.nextInt();
        System.out.print("Isikan Panjang           : ");
        double panjang = scan.nextDouble();
        System.out.print("Isikan Lebar             : ");
        double lebar = scan.nextDouble();
        printGaris();
        
        Rectangle rectangle = new Rectangle(idR, panjang, lebar);
       
        //panggil print deskripsi rectangle
        rectangle.printDeskripsi();
        printGaris();

        scan.close();
    }
}