/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp2.lelang.barang;

/**
 *
 * @author Lenovo
 */
public class Peserta {
    private String nama;
    private double saldo;

    public Peserta(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama() {
        return nama;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void tawar(BarangLelang barang, double jumlah) {
        barang.terimaPenawaran(this, jumlah);
    }
}