/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp2.lelang.barang;

/**
 *
 * @author Lenovo
 */
public class Seni extends BarangLelang {
    private String seniman;

    public Seni(String namaBarang, double hargaAwal, String seniman) {
        super(namaBarang, hargaAwal);
        this.seniman = seniman;
    }

    @Override
    public void mulaiLelang() {
        super.mulaiLelang();
        System.out.println("Karya seni ini dibuat oleh: " + seniman);
    }
}
