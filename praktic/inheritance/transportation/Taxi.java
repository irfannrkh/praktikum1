/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.inheritance.transportation;

/**
 *
 * @author Lenovo
 */
public class Taxi extends Vehicle {

    public Taxi(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    // Method khusus untuk menghitung tarif taksi berdasarkan kilometer
    public int calculateFare(int jarakKm) {
         int tarifPerKm = 5000;
        int totalTarif = currentPassengers * jarakKm * tarifPerKm;
        System.out.println("Total jarak rute: " + jarakKm + " KM");
        System.out.println("Total tarif perjalanan: " + totalTarif);
        return totalTarif;
}
 }
