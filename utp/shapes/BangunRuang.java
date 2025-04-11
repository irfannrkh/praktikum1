/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author Lenovo
 */
public abstract class BangunRuang {
    private String nama;
    private double tinggi;

    public void setNama(String inputNama) {
        this.nama = inputNama;
    }

    public String getNama() {
        return nama;
    }

    public void setTinggi(double inputTinggi) {
        this.tinggi = inputTinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public abstract double getLuasPermukaan();

    public abstract double getVolume();

    public void printInfo() {
        System.out.println("Nama           : " + getNama());
        System.out.println("Luas permukaan : " + getLuasPermukaan());
        System.out.println("Volume         : " + getVolume());
    }
}