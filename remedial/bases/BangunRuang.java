/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package remedial.bases;

/**
 *
 * @author Lenovo
 */
// Abstract class sebagai dasar semua bangun ruang
public abstract class BangunRuang {
    protected String nama; // Nama bangun ruang
    protected double tinggi; // Tinggi bangun ruang
    protected double massa; // Massa bangun ruang

    public BangunRuang() {} // Constructor default 

    // Method untuk mengisi nama
    public void setNama(String inputNama) {
        this.nama = inputNama;
    }

    // Method untuk mengambil nama
    public String getNama() {
        return nama;
    }

    // Method untuk mengisi tinggi
    public void setTinggi(double inputTinggi) {
        this.tinggi = inputTinggi;
    }

    // Method untuk mengambil tinggi
    public double getTinggi() {
        return tinggi;
    }

    // Method untuk mengisi massa
    public void setMassa(double inputMassa) {
        this.massa = inputMassa;
    }

    // Method untuk mengambil massa
    public double getMassa() {
        return massa;
    }

    // Method abstrak, wajib diimplementasikan di subclass
    public abstract void printInfo();
}