/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author Lenovo
 */
/*Mukhamad Irfan Nur Khakim - 245150701111021

// \\/\\\\\\\    /\\\\\\\\      /\       /\\\     /\\
/\ \/\\    /\\  /\\           /\ \\      /\ /\\   /\\
/\ \/\\    /\\  /\\          /\  /\\     /\\ /\\  /\\
/\ \/\ /\\      /\\\\\\     /\\   /\\    /\\  /\\ /\\
/\ \/\\  /\\    /\\        /\\\\\\ /\\   /\\   /\ /\\
/\ \/\\    /\\  /\\       /\\       /\\  /\\    /\ \\
/\ \/\\      /\ \/\\      /\\         /\ \/\\      /\\
*/

import java.util.Scanner;

public class Main {
    
    public static void printGaris() {
        System.out.println("==============================================");
    }
    
    
    public static void main(String[] args) {
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String RESET = "\u001B[0m";
        
        Scanner input = new Scanner(System.in);

        printGaris();
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println( GREEN+ "MUKHAMAD IRFAN NUR KHAKIM" + RESET);
        System.out.println( RED + "245150701111021" + RESET);
        printGaris();

        // Prisma Segitiga Sama Kaki
        System.out.println("Prisma Segitiga Sama Kaki");
        printGaris();
        System.out.print("Isikan alas   : ");
        double alas = input.nextDouble();
        System.out.print("Isikan kaki   : ");
        double kaki = input.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggiPrisma = input.nextDouble();

        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);
        printGaris();
        prisma.printInfo();
        printGaris();

        // Limas Persegi
        System.out.println("Limas Persegi");
        printGaris();
        System.out.print("Isikan sisi   : ");
        double sisi = input.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggiLimas = input.nextDouble();

        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);
        printGaris();
        limas.printInfo();
        printGaris();

        // Tabung
        System.out.println("Tabung");
        printGaris();
        System.out.print("Isikan radius : ");
        double radius = input.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggiTabung = input.nextDouble();

        Tabung tabung = new Tabung(radius, tinggiTabung);
        printGaris();
        tabung.printInfo();
        printGaris();

        input.close();
    }
}
