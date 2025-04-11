/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp2.lelang.barang;

/**
 *
 * @author Lenovo
 */
public class BarangLelang {
    protected String namaBarang;
    protected double hargaAwal;
    protected double penawaranTertinggi;
    protected Peserta pemenang;
    protected boolean statusLelang = true;

    public BarangLelang(String namaBarang, double hargaAwal) {
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
        this.penawaranTertinggi = hargaAwal;
    }

    public void mulaiLelang() {
        System.out.println("Lelang untuk " + namaBarang + " telah dimulai");
        System.out.println("dengan harga awal Rp" + format(hargaAwal));
    }

    public void terimaPenawaran(Peserta peserta, double jumlah) {
    System.out.println(peserta.getNama() + " menawar Rp" + format(jumlah));

    if (!statusLelang) {
        System.out.println("Penawaran tidak valid! Lelang sudah ditutup");
    } else if (jumlah > penawaranTertinggi && jumlah >= hargaAwal) {
        if (peserta.getSaldo() >= jumlah) {
            penawaranTertinggi = jumlah;
            pemenang = peserta;
            System.out.println("Penawaran disetujui!");
        } else {
            System.out.println("Penawaran tidak valid! Saldo " + peserta.getNama() + " tidak mencukupi");
        }
    } else {
        System.out.println("Penawaran tidak valid! Harus lebih tinggi dari Rp" + format(penawaranTertinggi));
    }
}

    public void tutupLelang() {
        statusLelang = false;
        if (pemenang != null) {
            System.out.println("Lelang ditutup! " + namaBarang + " terjual dengan harga Rp" +
                    format(penawaranTertinggi) + " kepada " + pemenang.getNama());
            double sisa = pemenang.getSaldo() - penawaranTertinggi;
            pemenang.setSaldo(sisa);
            System.out.println("Sisa saldo " + pemenang.getNama() + ": Rp" + format(sisa));
        }
    }

    public String format(double angka) {
        return String.format("%,.0f", angka).replace(',', '.');
    }
}
