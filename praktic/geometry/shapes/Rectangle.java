/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.geometry.shapes;

/**
 *
 * @author Lenovo
 */
public class Rectangle {
    private int id;
    private double panjang;
    private double lebar;

    // konstruktor dengan parameter
    public Rectangle(int id, double panjang, double lebar) {
        this.id = id;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    //getter  ID
    public int getId() {
        return id;
    }

    // getter  Panjang
    public double getPanjang() {
        return panjang;
    }

    // getter untuk Lebar
    public double getLebar() {
        return lebar;
    }

    // method Getter Keliling sekalian deklarasi rumus
    public double getKeliling() {
        return 2 * (panjang + lebar);
    }

    // method Getter luas dan rumus 
    public double getLuas() {
        return panjang * lebar;
    }

    // Method untuk print deskripsi persegi panjang
    public void printDeskripsi() {
        System.out.println("ID        : " + id);
        System.out.println("Panjang   : " + panjang);
        System.out.println("Lebar     : " + lebar);
        System.out.println("Keliling  : " + getKeliling());
        System.out.println("Luas      : " + getLuas());
        
    }
}

