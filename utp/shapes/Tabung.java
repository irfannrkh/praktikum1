/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author Lenovo
 */
public class Tabung extends BangunRuang {
    private double radius;
    private final int PEMBILANG = 22;
    private final int PENYEBUT = 7;

    public Tabung(double radius, double tinggi) {
        this.radius = radius;
        setTinggi(tinggi);
        setNama("Tabung");
    }

    public void setRadius(double inputRadius) {
        this.radius = inputRadius;
    }

    public double getPhi() {
        return (double) PEMBILANG / PENYEBUT;
    }

    public double getLuasAlas() {
        return radius * radius * getPhi();
    }

    public double getKeliling() {
        return 2 * radius * getPhi();
    }

    public double getLuasPermukaan() {
        return 2 * getLuasAlas() + getKeliling() * getTinggi();
    }

    public double getVolume() {
        return getLuasAlas() * getTinggi();
    }
}
