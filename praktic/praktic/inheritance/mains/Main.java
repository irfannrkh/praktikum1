/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.inheritance.mains;
import praktic.inheritance.transportation.*;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {

        // objek setiap jenis kendaraan
        Buss bus = new Buss("Bus", 50, "Terminal A - Terminal B");
        Train train = new Train("Kereta", 200, "Stasiun Kota - Stasiun Pusat");
        Taxi taxi = new Taxi("Taksi", 4, "Bandara - Hotel");

        // sumulasinya buss
        bus.startRoute();
        bus.addPassenger(30);
        bus.addPassenger(20);
        bus.calculateFare(5);
        bus.stopRoute();
        bus.removePassenger(50);

        System.out.println(); // buat baris kosong aja

        //simulasinay kereta
        train.startRoute();
        train.addPassenger(150);
        train.calculateFare();
        train.stopRoute();
        train.removePassenger(150);

        System.out.println();

        // simulasinya taxi
        taxi.startRoute();
        taxi.addPassenger(3);
        taxi.calculateFare(10);
        taxi.stopRoute();
        taxi.removePassenger(3);
        
        System.out.println();
        
        bus.startRoute();
        bus.addPassenger(30);
        bus.addPassenger(100);
        bus.calculateFare(5);
        bus.stopRoute();
        bus.removePassenger(30);
        
        System.out.println();
        
        train.startRoute();
        train.addPassenger(150);
        train.addPassenger(300);
        train.calculateFare();
        train.stopRoute();
        train.removePassenger(150);
        
        System.out.println();
                 
        taxi.addPassenger(3);
        taxi.addPassenger(10);
        taxi.calculateFare(10);
        taxi.stopRoute();
        taxi.removePassenger(3);
    }
}
