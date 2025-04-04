/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktic.inheritance.transportation;

/**
 *
 * @author Lenovo
 */
// kelas sudah publik sesuai 
public class Vehicle {
    
    // seberti biasa biin variabel sesuai ketentuan class diagram
    protected String name;                // nama kendaraan 
    protected int capacity;               // kapasitas maksimum penumpang
    protected int currentPassengers;      // jumlah penumpang saat ini
    protected String route;               // rute

    // Constructor inisialisasi data kendaraan
    public Vehicle(String name, int capacity, String route) {
        this.name = name;
        this.capacity = capacity;
        this.route = route;
        this.currentPassengers = 0; // awalnya belum ada penumpang
    }

    // Method untuk memulai perjalanan
    public void startRoute() {
        System.out.println(name + " memulai perjalanan pada rute: " + route);
    }

    // Method untuk menghentikan perjalanan
    public void stopRoute() {
        System.out.println(name + " mengakhiri perjalanan. Selamat Sampai tujuan YEAY!!");
    }

    // Method untuk menambahkan penumpang
    public void addPassenger(int count) {
        if (currentPassengers + count <= capacity) {
            currentPassengers += count;
            System.out.println(count + " Penumpang naik ke dalam " + name);
            System.out.println("Total Penumpang: " + currentPassengers);
        } else {
            System.out.println("Muatann penuh pak..., melebihi kapasitas maksimum.");
        }
    }

    // Method untuk menurunkan penumpang
    public void removePassenger(int count) {
        if (currentPassengers - count >= 0) {
            currentPassengers -= count;
            System.out.println(count + " Penumpang berhasil turun dari " + name);
        } else {
            System.out.println("Jumlah penumpang tidak bisa kurang dari 0.");
        }
    }

    // Method untuk menghitung tarif (kosong, akan diisi oleh anak kelas)
    public int calculateFare() {
        return 0;
    }
    
}