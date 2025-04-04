/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.inheritance.transportation;

/**
 *
 * @author Lenovo
 */
    
    public class Train extends Vehicle {

    public Train(String name, int capacity, String route) {
        super(name, capacity, route);
    }

    // Method override untuk menghitung tarif kereta
    @Override
    public int calculateFare() {
        int tarif = 10000;
        int totalTarif = currentPassengers * tarif;
        System.out.println("Tarif tetap per penumpang: " + tarif);
        System.out.println("Total tarif perjalanan: " + totalTarif);
        return totalTarif;
    }
}
    

