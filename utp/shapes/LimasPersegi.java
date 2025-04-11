/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author Lenovo
 */
public class LimasPersegi extends BangunRuang {
    private double sisi;

    public LimasPersegi(double sisi, double tinggi) {
        this.sisi = sisi;
        setTinggi(tinggi);
        setNama("Limas Persegi");
    }

    public double getTinggiSegitiga() {
        return Math.sqrt((getTinggi() * getTinggi()) + (sisi / 2) * (sisi / 2));
    }

    public double getLuasSegitiga() {
        return getTinggiSegitiga() * sisi / 2;
    }

    public double getLuasAlas() {
        return sisi * sisi;
    }

    public double getLuasPermukaan() {
        return 4 * getLuasSegitiga() + getLuasAlas();
    }

    public double getVolume() {
        return getLuasAlas() * getTinggi() / 3;
    }
}