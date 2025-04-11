/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp2.lelang.barang;

/**
 *
 * @author Lenovo
 */
public class Elektronik extends BarangLelang {
    private int garansi;

    public Elektronik(String namaBarang, double hargaAwal, int garansi) {
        super(namaBarang, hargaAwal);
        this.garansi = garansi;
    }

    @Override
    public void mulaiLelang() {
        super.mulaiLelang();
        System.out.println("Barang elektronik ini memiliki garansi: " + garansi + " tahun");
    }
}
