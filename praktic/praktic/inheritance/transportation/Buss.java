/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.inheritance.transportation;

/**
 *
 * @author Lenovo
 */
    
    public class Buss extends Vehicle {

    // Constructor memanggil constructor induk (super)
    public Buss(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    // Method khusus untuk menghitung tarif bus
    public int calculateFare(int jumlahHalte) {
        int tarifPerHalte = 2000;
        int totalTarif = currentPassengers * jumlahHalte * tarifPerHalte;
        System.out.println("Total Pemberhentian: " + jumlahHalte);
        System.out.println("Tarif per halte: " + tarifPerHalte);
        System.out.println("Total tarif perjalanan: " + totalTarif);
        return totalTarif; 
    }
}

